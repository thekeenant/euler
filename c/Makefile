# list of all program sources
SRCS = $(wildcard problem*.c)

BUILD = build

# list of output files (drops the .c extension)
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
