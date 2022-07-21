
Feature: card recommendation end to end


  Background: Landing on Bedarf tab
    Given : User gets the landing url
    And : Accept all cookies
    When : User clicks on Bedarf tab
    And : User clicks on start

  Scenario Outline: As a user complete the questionnaire
    When : User enters the DOB "<date>"
    And : User selects the gender "<gender>"
    And : User selects the type of house "<house_type>"
    And : User selects the type of vechicle "<vehicle_type>"
    And : User selects the family type "<family_type>"
    And : User selects the kids under eighteen "<yes_no>"
    And : User selects the profession "<profession>"
    And : User enters the job title "<job_title>"
    And : User enters the type of insurance "<health_insurance>"
    And : User selects the hobby "<hobby>"
    And : User selects the pets "<pets>"
    And : User enters the income "<annual_income>"
    And : User saves the questionnaire

    Examples:
      | date       | gender   | house_type                | vehicle_type | family_type         | yes_no | profession    | job_title           | health_insurance | hobby                                | pets  | annual_income |
      | 19.12.2001 | Männlich | In meiner eigenen Wohnung | Auto         | Ich bin Single      | Nein   | Angestellt    | Test Engineer       | Privat           | Ich reise sehr viel                  | Hund  | 20002         |
      | 28.01.1985 | Weiblich | Nichts davon              | Anhänger     | Ich bin verheiratet | Ja     | Selbstständig | Automation Engineer | Gesetzlich       | Ich arbeite gerne in Haus und Garten | Pferd | 99999         |

  @Clark
  Scenario: As a user check on the recommended insurance Private Altersvorsorge

    When : User enters the DOB "19.12.2001"
    And : User selects the gender "Männlich"
    And : User selects the type of house "In meiner eigenen Wohnung"
    And : User selects the type of vechicle "Anhänger"
    And : User selects the family type "Ich bin Single"
    And : User selects the kids under eighteen "Nein"
    And : User selects the profession "Angestellt"
    And : User enters the job title "Automation Engineer"
    And : User enters the type of insurance "Privat"
    And : User selects the hobby "Ich reise sehr viel"
    And : User selects the pets "Pferd"
    And : User enters the income "99999"
    And : User saves the questionnaire
    And : User enters the email "Uma@gmail.com"
    And : User enters the password "Uma@1991"
    And : User registers the details
    And : User navigates to recommended Card page
    And : User navigates to overviewtab
    And : User selects a recommended card "Private Altersvorsorge"
    Then : User should see the selected card details "Private Altersvorsorge"


  Scenario Outline: As a user check on the recommended insurance KFZ-Absicherung

    When : User enters the DOB "19.12.2001"
    And : User selects the gender "Männlich"
    And : User selects the type of house "In meiner eigenen Wohnung"
    And : User selects the type of vechicle "<vechicle>"
    And : User selects the family type "Ich bin Single"
    And : User selects the kids under eighteen "Nein"
    And : User selects the profession "Angestellt"
    And : User enters the job title "Automation Engineer"
    And : User enters the type of insurance "Privat"
    And : User selects the hobby "Ich reise sehr viel"
    And : User selects the pets "Pferd"
    And : User enters the income "99999"
    And : User saves the questionnaire
    And : User enters the email "Uma@gmail.com"
    And : User enters the password "Uma@1991"
    And : User registers the details
    And : User navigates to recommended Card page
    And : User navigates to overviewtab
    And : User selects a recommended card "KFZ-Absicherung "
    Then : User should see the selected card details "KFZ-Absicherung "
    Examples:
      | vechicle  |
      | Auto      |
      | Anhänger  |
      | Wohnwagen |
      | Motorrad  |

  Scenario Outline: As a user check on the recommended insurance Tierhalter-Haftpflicht

    When : User enters the DOB "19.12.2001"
    And : User selects the gender "Männlich"
    And : User selects the type of house "In meiner eigenen Wohnung"
    And : User selects the type of vechicle "Motorrad"
    And : User selects the family type "Ich bin Single"
    And : User selects the kids under eighteen "Nein"
    And : User selects the profession "Angestellt"
    And : User enters the job title "Automation Engineer"
    And : User enters the type of insurance "Privat"
    And : User selects the hobby "Ich reise sehr viel"
    And : User selects the pets "<pet>"
    And : User enters the income "99999"
    And : User saves the questionnaire
    And : User enters the email "Uma@gmail.com"
    And : User enters the password "Uma@1991"
    And : User registers the details
    And : User navigates to recommended Card page
    And : User navigates to overviewtab
    And : User selects a recommended card "KFZ-Absicherung "
    Then : User should see the selected card details "KFZ-Absicherung "
    Examples:
      | pet        |
      | Pferd      |
      | Hund       |
      | Kleintiere |
      | Katze      |

  Scenario Outline: As a user check on the recommended insurance

    When : User enters the DOB "19.12.2001"
    And : User selects the gender "Männlich"
    And : User selects the type of house "In meiner eigenen Wohnung"
    And : User selects the type of vechicle "Anhänger"
    And : User selects the family type "Ich bin Single"
    And : User selects the kids under eighteen "Nein"
    And : User selects the profession "Angestellt"
    And : User enters the job title "Automation Engineer"
    And : User enters the type of insurance "Privat"
    And : User selects the hobby "Ich reise sehr viel"
    And : User selects the pets "Pferd"
    And : User enters the income "99999"
    And : User saves the questionnaire
    And : User enters the email "Uma@gmail.com"
    And : User enters the password "Uma@1991"
    And : User registers the details
    And : User navigates to recommended Card page
    And : User navigates to overviewtab
    And : User selects a recommended card "<insurance_card>"
    Then : User should see the selected card details "<insurance_card>"
    Examples:
      | insurance_card                 |
      | Berufsunfähigkeitsversicherung |
      | Risikolebensversicherung       |
      | Sterbegeld                     |
