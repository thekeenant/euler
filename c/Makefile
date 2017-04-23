SRCS = $(wildcard problem*.c)

PROGS = $(patsubst %.c,%,$(SRCS))

all: $(PROGS)

%: %.c
	mkdir -p build
	$(CC) $(CFLAGS) -o build/$@ $<

clean: 
	rm -f build/
