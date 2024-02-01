# Gilded Rose Kata

## How to use this Kata

The simplest way is to just clone the code and start hacking away improving the design. You'll want to look at the "Gilded Rose Requirements" which explains what the code is for. I strongly advise you that you'll also need some tests if you want to make sure you don't break the code while you refactor.

You could write some unit tests yourself, using the requirements to identify suitable test cases. I've provided a failing unit test in a popular test framework as a starting point for most languages.

Alternatively, use the Approval tests provided in this repository. (Read more about that in the section "Text-based Approval Testing").

The idea of the exercise is to do some deliberate practice, and improve your skills at designing test cases and refactoring. The idea is not to re-write the code from scratch, but rather to practice taking small steps, running the tests often, and incrementally improving the design.

## Gilded Rose Requirements

Hi and welcome to team Gilded Rose. As you know, we are a small inn with a prime location in a prominent city ran by a friendly innkeeper named Allison. We also buy and sell only the finest goods. Unfortunately, our goods are constantly degrading in Quality as they approach their sell by date.

We have a system in place that updates our inventory for us. It was developed by a no-nonsense type named Leeroy, who has moved on to new adventures. Your task is to add the new feature to our system so that we can begin selling a new category of items. First an introduction to our system:

    All items have a SellIn value which denotes the number of days we have to sell the items
    All items have a Quality value which denotes how valuable the item is
    At the end of each day our system lowers both values for every item

Pretty simple, right? Well this is where it gets interesting:

    Once the sell by date has passed, Quality degrades twice as fast
    The Quality of an item is never negative
    "Aged Brie" actually increases in Quality the older it gets
    The Quality of an item is never more than 50
    "Sulfuras", being a legendary item, never has to be sold or decreases in Quality
    "Backstage passes", like aged brie, increases in Quality as its SellIn value approaches;
        Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but
        Quality drops to 0 after the concert

We have recently signed a supplier of conjured items. This requires an update to our system:

    "Conjured" items degrade in Quality twice as fast as normal items

Feel free to make any changes to the UpdateQuality method and add any new code as long as everything still works correctly. However, do not alter the Item class or Items property as those belong to the goblin in the corner who will insta-rage and one-shot you as he doesn't believe in shared code ownership (you can make the UpdateQuality method and Items property static if you like, we'll cover for you).

Just for clarification, an item can never have its Quality increase above 50, however "Sulfuras" is a legendary item and as such its Quality is 80 and it never alters.


## IntelliJ Shortcuts

    Fn + Up Arrow – Up
    Option + Left Arrow – Previous word
    Fn + Down Arrow – Down
    Option + Right Arrow – Next word
    Command + Left Arrow – Line start
    Command + Right Arrow – Line end
    Left Arrow – Left
    Right Arrow – Right

    Shift + Command + Up Arrow – Up with selection
    Shift + Option + Left Arrow – Previous word with selection
    Shift + Command + Down Arrow – Down with selection
    Shift + Option + Right Arrow – Next word with selection
    Shift + Command + Left Arrow – Line start with selection
    Shift + Command + Right Arrow – Line end with selection
    Shift + Left Arrow – Left with selection
    Shift + Right Arrow – Right with selection

    Option + Up Arrow – Previous method
    Option + Down Arrow – Next method
    Fn + Down Arrow – Page down
    Fn + Up Arrow – Page up
    Command + Minus – Back
    Command + Plus – Forward
    Command + B – Jump to source

    Command + F7 – Highlight usages in file
    Command + F7 – Show usages
    Option + Up Arrow – Expand selection
    Option + Down Arrow – Cycle expand word
    Backspace – Delete
    Shift + F6 – Rename
    Command + Shift + Y – Put parameters on one line
    Command + Y – Put parameters on separate lines

    Command + - – Collapse
    Command + + – Expand
    Command + Option + - – Collapse recursively
    Command + Option + + – Expand recursively
    Command + Shift + - – Collapse all
    Command + Shift + + – Expand all

    Command + Option + V – Introduce variable
    Command + Option + P – Introduce parameter
    Command + Option + M – Extract method
    Command + Option + N – Inline
    Command + Option + L – Reformat code
    Control + Shift + J – Join lines

    Command + M – Scroll to center
    Command + Option + Shift + Up Arrow – Move statement up
    Command + Option + Shift + Down Arrow – Move statement down
    Shift + Option + 8 – Column selection mode
    Command + Shift + A – Find action
    Command + K – Commit
    Command + S – Limited WIP | Commit without dialog

    Command + Tab – Switcher
    Command + G – Add selection for next occurrence
    Command + B – Git | Branches
    Command + Option + H – Notifications | Close first
    Command + V – VCS operations popup
    Command + Shift + P – Show type info
    Return – Start new line
    Escape – Hide active tool window

    Shift + F10 – Run
    Control + Shift + F10 – Run... (popup)
