package seedu.address.logic.commands;

import seedu.address.model.Model;

import static java.util.Objects.requireNonNull;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_POOLS;

/**
 * Lists all passengers in the address book to the user.
 */
public class ListPoolCommand extends Command {

    public static final String COMMAND_WORD = "listPool";

    public static final String MESSAGE_SUCCESS = "Listed all pools";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredPoolList(PREDICATE_SHOW_ALL_POOLS);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
