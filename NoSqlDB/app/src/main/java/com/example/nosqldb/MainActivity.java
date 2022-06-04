    package com.example.nosqldb;

    import androidx.appcompat.app.AppCompatActivity;

    import android.app.AlertDialog;
    import android.database.Cursor;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {

        // define the UI components
        EditText name,contact,dateofbirth;
        Button insert,update,delete,select;
        // its a Class
        DBHelper DB;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // Connect the UI components
            name = (EditText) findViewById(R.id.name);
            contact = (EditText) findViewById(R.id.contact);
            dateofbirth = (EditText) findViewById(R.id.DateOfBirth);
            insert = (Button) findViewById(R.id.btnInsert);
            update = (Button) findViewById(R.id.btUpdate);
            delete = (Button) findViewById(R.id.btDelete);
            select = (Button) findViewById(R.id.btView);

            //Create instance of DBHelper
            DB = new DBHelper(this);

           //Create the listener on Buttons
            // insert button
            insert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // get the values from textboxes
                    String username = name.getText().toString();
                    String usercontact = contact.getText().toString();
                    String userDOB = dateofbirth.getText().toString();

                    // vairable to check if the insert done successfully or not
                    Boolean checkinsertData;
                    // call the method insert from DBHelper class
                    checkinsertData = DB.insertUserData(username,usercontact,userDOB);

                    if(checkinsertData == true)
                    {
                        Toast.makeText(MainActivity.this,"New Entry Inserted",Toast.LENGTH_LONG).show();
                    }

                    else
                    {
                        Toast.makeText(MainActivity.this,"New Entry not Inserted",Toast.LENGTH_LONG).show();
                    }

                }
            });

            //update button
            update.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    // get the values from textboxes
                    String username = name.getText().toString();
                    String usercontact = contact.getText().toString();
                    String userDOB = dateofbirth.getText().toString();

                    // vairable to check if the insert done successfully or not
                    Boolean checkupdateData;
                    // call the method update from DBHelper class
                    checkupdateData = DB.updateUserData(username,usercontact,userDOB);

                    if(checkupdateData == true)
                    {
                        Toast.makeText(MainActivity.this,"User Updated",Toast.LENGTH_LONG).show();
                    }

                    else
                    {
                        Toast.makeText(MainActivity.this,"User not Updated",Toast.LENGTH_LONG).show();
                    }

                }
            });

            //delete button
            delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // get the name from textbox
                    String username = name.getText().toString();
                    // variable to check if the delete done successfully or not
                    Boolean checkdeleteData;
                    // call the method delete from DBHelper class
                    checkdeleteData = DB.deleteUserData(username);

                    if(checkdeleteData == true)
                    {
                        Toast.makeText(MainActivity.this,"User deleted",Toast.LENGTH_LONG).show();
                    }

                    else
                    {
                        Toast.makeText(MainActivity.this,"User not deleted",Toast.LENGTH_LONG).show();
                    }
                }
            });


            // view listener
            select.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // call the method select from DBHelper class
                    // hold the values into cursor
                    Cursor cursor = DB.getUserData();

                    if (cursor.getCount() == 0) {
                        Toast.makeText(MainActivity.this, "User not exist ", Toast.LENGTH_LONG).show();
                    }
                    else {
                        // read data from cusror
                        StringBuffer stringBuffer = new StringBuffer();

                        // while cursos have rows
                        while (cursor.moveToNext()) {
                            stringBuffer.append("Name : " + cursor.getString(0)
                                    + "\n");
                            stringBuffer.append("Contact : " + cursor.getString(1)
                                    + "\n");
                            stringBuffer.append("DOB : " + cursor.getString(2)
                                    + "\n\n");

                        }

                        //Use alert dialog to show data
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        //alert details
                        builder.setCancelable(true);
                        builder.setTitle("User entries");
                        builder.setMessage(stringBuffer.toString()); // stringbuffer instance details
                        builder.show();
                    }
                }
            });
        }
    }