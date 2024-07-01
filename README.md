# deterministic-finite-automaton
deterministic finite automaton (DFA). In this implementation, the code checks each character of the input string sequentially and changes the state based on the current character, without any recursive function calls.

Grammar:
S -> A d B C
A -> 'a' A | 'a'
B -> 'b' B | ε
C -> 'c' C | 'c'

Automaton:
States: q0 (start), q1, q2, q3, q4, q5 (accept)
Alphabet: {'a', 'd', 'b', 'c'}
Start state: q0
Accept state: q5
Transitions:
q0 --'a'--> q1
q1 --'a'--> q1
q1 --'d'--> q2
q2 --'b'--> q3
q3 --'b'--> q3
q2 --'c'--> q4
q3 --'c'--> q4
q4 --'c'--> q5
q5 --'c'--> q5
