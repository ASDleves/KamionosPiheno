| Résztvevők      | Feladatkör  | 
| :-------------: | :--------:  |
| Bella Richárd   | Repository  |
| Katona Valentin | README file |
| Vörös Dominik | Java project |

#
# Kamionos Pihenő program.

#### Egy pihenő hely, ahol parkolók vannak, és a sofőrök pihenni tudnak, és kipihentek lesznek.
#### A parkolóba menetelkor egy jegyet kap, amin rajta van, hogy melyik parkolóba állhat meg.
#### Vannak nagyon fáradt sofőrök, akiknek 2 nap pihenésre van szüksége.
#### A parkolót fel is lehet újjítani, ez idő alatt nem lehet bent vendég, illetve be se juthatnak. 

### Technikai specifikáció: 
#### A parkoló tömbben tárolja el a sofőröket. Alapértelmezett befogadó képessége az 5 férőhely.
#### A pihenés státusz az 0%-tól megy felfelé 100%-ig. Egy pihenéssel ez felmegy 0-ról 100-ra
#### A nagyon fáradt sofőröknek 2 pihenése van szüksége ahhoz, hogy felmenjen 100%-ra.
#### Van egy felújjít és egy felújjításvége metódus, amiben az a felújjítás elkezdi a folyamatot, a vége pedig befejezi.
#### Van pihenés, és szuper pihenés, a szuper pihenés, ebből elég egy pihenés a fáradt sofőrnek.
#### Az Ember az abstract, a sofőr illetve a fáradt sofőr őse. Mindketten tudnak pihenni, de más a töltődése.
