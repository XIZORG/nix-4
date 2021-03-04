#!/bin/bash

MENU=(
    "Запуск без сборщиков"
    "Запуск приложения ant"
    "Запуск maven проекта"
    "Очистка всех проектов"
    "Завершение работы"
)
select menu in "${MENU[@]}" ; do
    case $REPLY in
        1) cd terminal_launch
          ./run.sh
          cd ../;;
        2) cd ant_launch
          ./run.sh
          cd ../;;
        3) cd maven_launch
          ./run.sh
          cd ../;;
        4) cd terminal_launch
          ./clean.sh
          cd ../ant_launch
          ./clean.sh
          cd ../maven_launch
          ./clean.sh
          cd ../;;
        5) break ;;
    esac
done
