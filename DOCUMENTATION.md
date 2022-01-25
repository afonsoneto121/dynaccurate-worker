# Documentation 

The documentation generate through Postman https://documenter.getpostman.com/view/16544315/UVe9SVdK

## Environment Variables

* APP_PORT
* DB_USER
* DB_PASS
* DB_HOST
* DB_PORT
* RABBIT_HOST
* RABBIT_PORT
* RABBIT_USER
* RABBIT_PASS



## Endpoints

### Publish event

```
POST :8086/api/v1/events/publish
```

**Body**

```
{
    "id": "10", 
    "type": "event 1", 
    "dateTime": "2022-01-24T12:20:47.557452",
    "nicknameUser": "afonso"
}
```

**Response**

- 204 NO_CONTENT
- 400 BAD REQUEST



### Publish list events

```
POST :8086/api/v1/events/publish_list
```

**Body**

```
[
    {
    "id": "12", 
    "type": "event 1", 
    "dateTime": "2022-01-24T12:20:47.557452",
    "nicknameUser": "afonso"
    },
    {
    "id": "13", 
    "type": "event 1", 
    "dateTime": "2022-01-23T12:20:47.557452",
    "nicknameUser": "afonso"
    },
    {
    "id": "14", 
    "type": "event 1", 
    "dateTime": "2022-01-22T12:20:47.557452",
    "nicknameUser": "afonso"
    }
]
```

**Response**

- 204 NO_CONTENT
- 400 BAD REQUEST