#language: es

Caracteristica:
    Yo como usuario de Youtube
    Quiero buscar una lista de videos
    Para encontrar la cantidad de videos en la búsqueda
  Esquema del escenario:
    Dado Abro la aplicación
    Cuando Busco un "<Videos>"
    Entonces valido la lista de videos

  Ejemplos:
  |Videos|
  |Andrés Calamaro  |
  |Norick |
  |Guns N' Roses  |

