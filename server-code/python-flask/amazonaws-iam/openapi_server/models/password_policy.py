from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PasswordPolicy(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, minimum_password_length=None, require_symbols=None, require_numbers=None, require_uppercase_characters=None, require_lowercase_characters=None, allow_users_to_change_password=None, expire_passwords=None, max_password_age=None, password_reuse_prevention=None, hard_expiry=None):  # noqa: E501
        """PasswordPolicy - a model defined in OpenAPI

        :param minimum_password_length: The minimum_password_length of this PasswordPolicy.  # noqa: E501
        :type minimum_password_length: int
        :param require_symbols: The require_symbols of this PasswordPolicy.  # noqa: E501
        :type require_symbols: bool
        :param require_numbers: The require_numbers of this PasswordPolicy.  # noqa: E501
        :type require_numbers: bool
        :param require_uppercase_characters: The require_uppercase_characters of this PasswordPolicy.  # noqa: E501
        :type require_uppercase_characters: bool
        :param require_lowercase_characters: The require_lowercase_characters of this PasswordPolicy.  # noqa: E501
        :type require_lowercase_characters: bool
        :param allow_users_to_change_password: The allow_users_to_change_password of this PasswordPolicy.  # noqa: E501
        :type allow_users_to_change_password: bool
        :param expire_passwords: The expire_passwords of this PasswordPolicy.  # noqa: E501
        :type expire_passwords: bool
        :param max_password_age: The max_password_age of this PasswordPolicy.  # noqa: E501
        :type max_password_age: int
        :param password_reuse_prevention: The password_reuse_prevention of this PasswordPolicy.  # noqa: E501
        :type password_reuse_prevention: int
        :param hard_expiry: The hard_expiry of this PasswordPolicy.  # noqa: E501
        :type hard_expiry: bool
        """
        self.openapi_types = {
            'minimum_password_length': int,
            'require_symbols': bool,
            'require_numbers': bool,
            'require_uppercase_characters': bool,
            'require_lowercase_characters': bool,
            'allow_users_to_change_password': bool,
            'expire_passwords': bool,
            'max_password_age': int,
            'password_reuse_prevention': int,
            'hard_expiry': bool
        }

        self.attribute_map = {
            'minimum_password_length': 'MinimumPasswordLength',
            'require_symbols': 'RequireSymbols',
            'require_numbers': 'RequireNumbers',
            'require_uppercase_characters': 'RequireUppercaseCharacters',
            'require_lowercase_characters': 'RequireLowercaseCharacters',
            'allow_users_to_change_password': 'AllowUsersToChangePassword',
            'expire_passwords': 'ExpirePasswords',
            'max_password_age': 'MaxPasswordAge',
            'password_reuse_prevention': 'PasswordReusePrevention',
            'hard_expiry': 'HardExpiry'
        }

        self._minimum_password_length = minimum_password_length
        self._require_symbols = require_symbols
        self._require_numbers = require_numbers
        self._require_uppercase_characters = require_uppercase_characters
        self._require_lowercase_characters = require_lowercase_characters
        self._allow_users_to_change_password = allow_users_to_change_password
        self._expire_passwords = expire_passwords
        self._max_password_age = max_password_age
        self._password_reuse_prevention = password_reuse_prevention
        self._hard_expiry = hard_expiry

    @classmethod
    def from_dict(cls, dikt) -> 'PasswordPolicy':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PasswordPolicy of this PasswordPolicy.  # noqa: E501
        :rtype: PasswordPolicy
        """
        return util.deserialize_model(dikt, cls)

    @property
    def minimum_password_length(self) -> int:
        """Gets the minimum_password_length of this PasswordPolicy.


        :return: The minimum_password_length of this PasswordPolicy.
        :rtype: int
        """
        return self._minimum_password_length

    @minimum_password_length.setter
    def minimum_password_length(self, minimum_password_length: int):
        """Sets the minimum_password_length of this PasswordPolicy.


        :param minimum_password_length: The minimum_password_length of this PasswordPolicy.
        :type minimum_password_length: int
        """

        self._minimum_password_length = minimum_password_length

    @property
    def require_symbols(self) -> bool:
        """Gets the require_symbols of this PasswordPolicy.


        :return: The require_symbols of this PasswordPolicy.
        :rtype: bool
        """
        return self._require_symbols

    @require_symbols.setter
    def require_symbols(self, require_symbols: bool):
        """Sets the require_symbols of this PasswordPolicy.


        :param require_symbols: The require_symbols of this PasswordPolicy.
        :type require_symbols: bool
        """

        self._require_symbols = require_symbols

    @property
    def require_numbers(self) -> bool:
        """Gets the require_numbers of this PasswordPolicy.


        :return: The require_numbers of this PasswordPolicy.
        :rtype: bool
        """
        return self._require_numbers

    @require_numbers.setter
    def require_numbers(self, require_numbers: bool):
        """Sets the require_numbers of this PasswordPolicy.


        :param require_numbers: The require_numbers of this PasswordPolicy.
        :type require_numbers: bool
        """

        self._require_numbers = require_numbers

    @property
    def require_uppercase_characters(self) -> bool:
        """Gets the require_uppercase_characters of this PasswordPolicy.


        :return: The require_uppercase_characters of this PasswordPolicy.
        :rtype: bool
        """
        return self._require_uppercase_characters

    @require_uppercase_characters.setter
    def require_uppercase_characters(self, require_uppercase_characters: bool):
        """Sets the require_uppercase_characters of this PasswordPolicy.


        :param require_uppercase_characters: The require_uppercase_characters of this PasswordPolicy.
        :type require_uppercase_characters: bool
        """

        self._require_uppercase_characters = require_uppercase_characters

    @property
    def require_lowercase_characters(self) -> bool:
        """Gets the require_lowercase_characters of this PasswordPolicy.


        :return: The require_lowercase_characters of this PasswordPolicy.
        :rtype: bool
        """
        return self._require_lowercase_characters

    @require_lowercase_characters.setter
    def require_lowercase_characters(self, require_lowercase_characters: bool):
        """Sets the require_lowercase_characters of this PasswordPolicy.


        :param require_lowercase_characters: The require_lowercase_characters of this PasswordPolicy.
        :type require_lowercase_characters: bool
        """

        self._require_lowercase_characters = require_lowercase_characters

    @property
    def allow_users_to_change_password(self) -> bool:
        """Gets the allow_users_to_change_password of this PasswordPolicy.


        :return: The allow_users_to_change_password of this PasswordPolicy.
        :rtype: bool
        """
        return self._allow_users_to_change_password

    @allow_users_to_change_password.setter
    def allow_users_to_change_password(self, allow_users_to_change_password: bool):
        """Sets the allow_users_to_change_password of this PasswordPolicy.


        :param allow_users_to_change_password: The allow_users_to_change_password of this PasswordPolicy.
        :type allow_users_to_change_password: bool
        """

        self._allow_users_to_change_password = allow_users_to_change_password

    @property
    def expire_passwords(self) -> bool:
        """Gets the expire_passwords of this PasswordPolicy.


        :return: The expire_passwords of this PasswordPolicy.
        :rtype: bool
        """
        return self._expire_passwords

    @expire_passwords.setter
    def expire_passwords(self, expire_passwords: bool):
        """Sets the expire_passwords of this PasswordPolicy.


        :param expire_passwords: The expire_passwords of this PasswordPolicy.
        :type expire_passwords: bool
        """

        self._expire_passwords = expire_passwords

    @property
    def max_password_age(self) -> int:
        """Gets the max_password_age of this PasswordPolicy.


        :return: The max_password_age of this PasswordPolicy.
        :rtype: int
        """
        return self._max_password_age

    @max_password_age.setter
    def max_password_age(self, max_password_age: int):
        """Sets the max_password_age of this PasswordPolicy.


        :param max_password_age: The max_password_age of this PasswordPolicy.
        :type max_password_age: int
        """

        self._max_password_age = max_password_age

    @property
    def password_reuse_prevention(self) -> int:
        """Gets the password_reuse_prevention of this PasswordPolicy.


        :return: The password_reuse_prevention of this PasswordPolicy.
        :rtype: int
        """
        return self._password_reuse_prevention

    @password_reuse_prevention.setter
    def password_reuse_prevention(self, password_reuse_prevention: int):
        """Sets the password_reuse_prevention of this PasswordPolicy.


        :param password_reuse_prevention: The password_reuse_prevention of this PasswordPolicy.
        :type password_reuse_prevention: int
        """

        self._password_reuse_prevention = password_reuse_prevention

    @property
    def hard_expiry(self) -> bool:
        """Gets the hard_expiry of this PasswordPolicy.


        :return: The hard_expiry of this PasswordPolicy.
        :rtype: bool
        """
        return self._hard_expiry

    @hard_expiry.setter
    def hard_expiry(self, hard_expiry: bool):
        """Sets the hard_expiry of this PasswordPolicy.


        :param hard_expiry: The hard_expiry of this PasswordPolicy.
        :type hard_expiry: bool
        """

        self._hard_expiry = hard_expiry
