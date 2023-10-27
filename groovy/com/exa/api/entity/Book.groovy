package com.exa.api.entity
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Table
import jakarta.persistence.GenerationType
import jakarta.validation.constraints.NotNull
import jakarta.persistence.Column
import jakarta.persistence.ManyToOne
import jakarta.persistence.JoinColumn

@Entity
@Table(name = "books")
class Books {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 Integer id

 @NotNull
 @Column(nullable = false)
 String name
 
 @ManyToOne
 @JoinColumn(name="idcategory")
 Category category

 @Column
 String isbn
}