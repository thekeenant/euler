# list of all program sources
CC=gcc
CFLAGS=-Wall
LDLIBS=-lm

SRCS = $(wildcard problem*.c)
BUILD = build
PROGS = $(SRCS:%.c=$(BUILD)/%)

.PHONY: all
all: $(PROGS)

build:
	mkdir -p $(BUILD)

.INTERMEDIATE: $(notdir $(PROGS))
.DELETE_ON_ERROR:

$(PROGS): $(BUILD)/%:%|$(BUILD)
	mv $^ $@

.PHONY: clean
clean:
	rm -rf $(BUILD)
