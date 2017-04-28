Meta:

Narrative:
Jako Doradca
Chciałbym zalogować się do sytemu CRM2
I udzielić pożyczki Pr5

Scenario: udzielenie pozyczki PR5
Given Zalogować się do systemu jako m.zalewski
When Udzielam pozyczki PR5 nowemu klientowi
Then Nowy klient z zadłużeniem PR5