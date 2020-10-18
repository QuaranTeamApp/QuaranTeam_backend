# Requirements for the database.

## Functional:
* A user has a username 
* A user can join 1 or more groups
* Each group has a group name and a group admin

## Tables:
* Base entity = User
* Second entity = Groups

### User Table
username PRIMARY string NOT NULL
groups (List of groups)

### Group Table
groupname PRIMARY string NOT NULL
admin user NOT NULL
deleted BOOLEAN NOT NULL (DEFAULT true)
users (list of user type, append to end)
users_pending (list of user type)
date_created DATETIME NOT NULL
group_data JSON
capacity INTEGER NOT NULL (DEFAULT 256)
invite_code STRING NOT NULL (UUID)

#### group_data
{
    "link" : string,
    "meeting_times" : {
       "time1" : datetime,
       "time2" : datetime,
       "time3" : datetime
    },
    "description" : string,
}

