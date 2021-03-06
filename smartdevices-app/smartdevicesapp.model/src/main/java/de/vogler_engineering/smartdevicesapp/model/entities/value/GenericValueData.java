/**
 * Copyright (c) Vogler Engineering GmbH. All rights reserved.
 * Licensed under the MIT License. See LICENSE.md in the project root for license information.
 */
package de.vogler_engineering.smartdevicesapp.model.entities.value;

import lombok.Data;

/**
 * Created by vh on 14.02.2018.
 */

@Data
public class GenericValueData<T> {
    protected String name;
    protected String configKey;
    protected T value;
}
