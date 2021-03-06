# Hibernate-Mapping
Demo with the relationship that can be established between entities.


## M:N - Many to many

![](https://storage.googleapis.com/slite-api-files-production/files/15417390-3596-4551-985b-d0be673d8a95/mtm.png)

| ORDERS                                                                                                                                                                                                                   |               ITEM               |
| :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | :------------------------------: |
| @ManyToMany<br /><br />_For addictional customization:_<br />@JoinTable(name = "order_item",<br />        joinColumns = @JoinColumn(name = "item_id"),<br />        inverseJoinColumns = @JoinColumn(name = "order_id")) | @ManyToMany(mappedBy = "orders") |

## 1:N One to Many

![](https://storage.googleapis.com/slite-api-files-production/files/e99cda0c-380d-4c26-9669-5ee15a8f40ab/otm.png)

Unidirectional:

| ARTICLE                                          | AUTHOR |
| :----------------------------------------------- | :----: |
| @ManyToOne<br />@JoinColumn(name = "author_id") |        |

Bidirectional:

| ARTICLE     |              AUTHOR             |
| :---------- | :-----------------------------: |
| @ManyToOne | @OneToMany(mappedBy = "author") |

## 1:1 One to one

![](https://storage.googleapis.com/slite-api-files-production/files/0bc15998-b703-4e0d-b2c7-f8267a9b9a17/oto.png)

Unidirectional:

| CUSTOMER  | PROFILE |
| :-------- | :-----: |
| @OneToOne |         |

Bidirectional:

| CUSTOMER  |             PROFILE             |
| :-------- | :-----------------------------: |
| @OneToOne | @OneToOne(mappedBy = "profile") |
