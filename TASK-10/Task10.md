# Task 10 – Packages, Access Modifiers, Getters, Setters and Wrapper Classes

## 1. Packages

Packages are used to organize related Java classes. This program belongs to the `Task10` package.

## 2. Access Modifiers

Access modifiers control the visibility of class members.

- `private`: accessible only within the same class.
- `public`: accessible from anywhere.
- `protected`: accessible within the same package and by subclasses.
- Default: accessible within the same package.

The Vehicle class uses private fields to protect its data.

## 3. Getters and Setters

Getters retrieve private field values, while setters modify them.

Validation is included in the setters to prevent invalid registration numbers, vehicle types and parking fees.

## 4. Wrapper Classes

Wrapper classes represent primitive data types as objects.

Examples:
- `Integer` is the wrapper class for `int`.
- `Double` is the wrapper class for `double`.

## 5. Autoboxing and Unboxing

- Autoboxing automatically converts a primitive value into its wrapper object.
- Unboxing converts a wrapper object into its corresponding primitive value.

For example, assigning a `double` to a `Double` variable demonstrates autoboxing.

**Risk:** Unboxing a null wrapper object can cause a `NullPointerException`. Therefore, wrapper objects should be checked before use.

## 6. Conclusion

This task demonstrates data encapsulation, access control, validation, packages, wrapper classes, autoboxing and unboxing.