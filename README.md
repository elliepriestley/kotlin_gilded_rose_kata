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

    Alt I – Up
    Alt J – Previous word
    Alt K – Down
    Alt L – Next word
    Alt U – Line start
    Alt O – Line end
    Alt N – Left
    Alt M – Right

    Alt Shift I – Up with selection
    Alt Shift J – Previous word with selection
    Alt Shift K – Down with selection
    Alt Shift L – Next word with selection
    Alt Shift U – Line start with selection
    Alt Shift O – Line end with selection
    Alt Shift N – Left with selection
    Alt Shift M – Right with selection

    Alt , – Previous method
    Alt . – Next method
    Alt F – Page down
    Alt W – Page up
    Alt B – Back
    Alt Shift B – Forward
    Alt H – Jump to source

    Alt A – Highlight usages in file
    Alt S – Show usages
    Alt E – Expand selection
    Alt / – Cycle expand word
    Alt ; – Delete
    Alt R – Rename
    Alt Shift 8 – Put parameters on one line
    Alt Shift 9 – Put parameters on separate lines

    Cmd - – Collapse
    Cmd = – Expand
    Cmd Alt - – Collapse recursively
    Cmd Alt = – Expand recursively
    Cmd Shift - – Collapse all
    Cmd Shift = – Expand all

    Cmd Alt V – Introduce variable
    Cmd Alt P – Introduce parameter
    Cmd Alt M – Extract method
    Cmd Alt N – Inline
    Cmd Alt L – Reformat code
    Ctrl Shift J – Join lines

    Cmd M – Scroll to center
    Cmd Alt Shift I – Move statement up
    Cmd Alt Shift K – Move statement down
    Cmd Shift 8 – Column selection mode
    Cmd Shift A – Find action
    Cmd K – Commit
    Cmd S – Limited WIP | Commit without dialog

    Ctrl Tab – Switcher
    Ctrl G – Add selection for next occurrence
    Ctrl B – Git | Branches
    Ctrl Cmd H – Notifications | Close first
    Ctrl V – VCS operations popup
    Ctrl Shift P – Show type info
    Shift Enter – Start new line
    Shift Escape – Hide active tool window

    Shift F10 – Run
    Alt Shift F10 – Run... (popup)
