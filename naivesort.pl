% naivesort.pl
sorted([]).
sorted([_]).
sorted([X,Y|Rest]) :- X =< Y, sorted([Y|Rest]).

permuts([],[]).
permuts([Head|Tail],Perm) :- 
		permuts(Tail,Atli), 
		inserts(Head,Atli,Perm).

inserts(X,[],[X]).
inserts(X,[Head|Tail],[X,Head|Tail]).
inserts(X,[Head|Tail],[Head|Rest]) :- inserts(X,Tail,Rest).

naivesort(As,Bs) :- 
		permuts(As,Bs),
		sorted(Bs).