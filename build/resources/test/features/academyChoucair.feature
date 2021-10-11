# Autor: Steven Giraldo
  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screenplay at the Chourcair Academy with the automation course
    @sceneario1
    Scenario Outline: Search for a automation course
      Given than Brandon wants to learn automation at the academy chourcair
      | strUser   | strPassword       |
      | <strUser> | <strPassword>     |
      When he search for the course on the choucair academy platform
      | strCourse    |
      | <strCourse> |
      Then he finds the course called
      | strCourse   |
      | <strCourse> |

      Examples:
      | strUser    | strPassword    | strCourse               |
      | 1053849728 |  Choucair2021* | Metodología Bancolombia |