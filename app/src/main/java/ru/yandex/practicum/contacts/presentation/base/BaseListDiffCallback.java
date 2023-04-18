package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import org.jetbrains.annotations.NotNull;

public class BaseListDiffCallback<T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T> {

    @Override
    public boolean areItemsTheSame(@NonNull @NotNull T oldItem, @NonNull @NotNull T newItem) {
        return newItem.theSameAs(oldItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull @NotNull T oldItem, @NonNull @NotNull T newItem) {
        return oldItem.equals(newItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull T oldItem, @NonNull T newItem) {
        return newItem;
    }
}
// implements ListDiffInterface<T>> extends DiffUtil.ItemCallback<T> implements ListDiffInterface<T>