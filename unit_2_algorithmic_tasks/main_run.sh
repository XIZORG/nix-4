#!/bin/bash

MENU=(
    "Сумма чисел в строке"
    "Количество всех символов"
    "Задача на окончание урока"
    "Очистка всех проектов"
    "Завершение работы"
)
select menu in "${MENU[@]}" ; do
    case $REPLY in
        1) cd firstTask
          ./run.sh
          cd ../;;
        2) cd SecondTask
          ./run.sh
          cd ../;;
        3) cd thirdTask
          ./run.sh
          cd ../;;
        4) cd firstTask
          ./clean.sh
          cd ../SecondTask
          ./clean.sh
          cd ../thirdTask
          ./clean.sh
          cd ../;;
        5) break ;;
    esac
done
