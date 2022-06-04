    package com.example.nosqldb;

    import android.content.ContentValues;
    import android.content.Context;
    import android.database.Cursor;
    import android.database.CursorWrapper;
    import android.database.sqlite.SQLiteDatabase;
    import android.database.sqlite.SQLiteOpenHelper;

    import androidx.annotation.Nullable;

    //This class it will be Sql Connection
    // and for all CRUD operations
    // extends class framework class SQLliteOpenHelper
    public class DBHelper extends SQLiteOpenHelper
    {
        // get context from user
        public DBHelper( Context context) {
            super(context, "Userdata.db",null,1);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {

            // SQL command
            //Create table
            sqLiteDatabase.execSQL(
                    "CREATE Table Userdetails" +
                            "(  " +
                            " name TEXT PRIMARY KEY ," +
                            "contact TEXT ," +
                            "dob TEXT  " +
                            ")"
                    );

        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
            //SQL COMMAND
            //Drop the table already exist
            sqLiteDatabase.execSQL("DROP TABLE Userdetails");
        }



        // CREATE CRUD METHODS
         //Insert User
        public Boolean insertUserData (String name ,String contact , String dob)
        {
            //Open DB to write
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            //insert the values into table columns
            contentValues.put("name",name);
            contentValues.put("contact",contact);
            contentValues.put("dob",dob);

            // insert and return the result of insertion
            long result = db.insert("Userdetails",null,contentValues);

            // check if insert is true
            if(result == -1){return false;}
            else{return true;}
        }



        //Update User Data
        public Boolean updateUserData (String name ,String contact , String dob)
        {
            //open DB to write
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            // insert the new values
            contentValues.put("contact",contact);
            contentValues.put("dob",dob);

            // get the specific User
            Cursor cursor = db.rawQuery("SELECT * FROM Userdetails WHERE name = ?",new String[] {name});
            //if user is exist
            if(cursor.getCount()>0)
            {
                // do the update
                long result = db.update("Userdetails ",contentValues,"name = ?",new String[]{name});
                // check if update  is true
                if(result == -1){return false;}
                else{return true;}
            }
            else
            {
                return false;
            }
        }



        //Delete User
        public Boolean deleteUserData (String name)
        {
            //Open Db to write
            SQLiteDatabase db = this.getWritableDatabase();
           // get the user with specific name
            Cursor cursor = db.rawQuery("SELECT * FROM Userdetails WHERE name = ?",new String[] {name});
            //If the user is exist
            if(cursor.getCount() > 0)
            {
                // delete
                long result = db.delete("Userdetails","name = ?",new String[] {name});
                // check if delete is true
                if(result ==-1) {return false;}
                else return true;
            }
            else
            {
                return false;
            }
        }


        //Get Data
        public Cursor getUserData ()
        {
            // open DB to read
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.rawQuery("SELECT * FROM Userdetails ",null);
            return cursor;
        }
    }
