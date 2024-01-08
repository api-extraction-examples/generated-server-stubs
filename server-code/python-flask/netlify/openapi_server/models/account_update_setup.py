from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class AccountUpdateSetup(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, billing_details=None, billing_email=None, billing_name=None, extra_seats_block=None, name=None, slug=None, type_id=None):  # noqa: E501
        """AccountUpdateSetup - a model defined in OpenAPI

        :param billing_details: The billing_details of this AccountUpdateSetup.  # noqa: E501
        :type billing_details: str
        :param billing_email: The billing_email of this AccountUpdateSetup.  # noqa: E501
        :type billing_email: str
        :param billing_name: The billing_name of this AccountUpdateSetup.  # noqa: E501
        :type billing_name: str
        :param extra_seats_block: The extra_seats_block of this AccountUpdateSetup.  # noqa: E501
        :type extra_seats_block: int
        :param name: The name of this AccountUpdateSetup.  # noqa: E501
        :type name: str
        :param slug: The slug of this AccountUpdateSetup.  # noqa: E501
        :type slug: str
        :param type_id: The type_id of this AccountUpdateSetup.  # noqa: E501
        :type type_id: str
        """
        self.openapi_types = {
            'billing_details': str,
            'billing_email': str,
            'billing_name': str,
            'extra_seats_block': int,
            'name': str,
            'slug': str,
            'type_id': str
        }

        self.attribute_map = {
            'billing_details': 'billing_details',
            'billing_email': 'billing_email',
            'billing_name': 'billing_name',
            'extra_seats_block': 'extra_seats_block',
            'name': 'name',
            'slug': 'slug',
            'type_id': 'type_id'
        }

        self._billing_details = billing_details
        self._billing_email = billing_email
        self._billing_name = billing_name
        self._extra_seats_block = extra_seats_block
        self._name = name
        self._slug = slug
        self._type_id = type_id

    @classmethod
    def from_dict(cls, dikt) -> 'AccountUpdateSetup':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The accountUpdateSetup of this AccountUpdateSetup.  # noqa: E501
        :rtype: AccountUpdateSetup
        """
        return util.deserialize_model(dikt, cls)

    @property
    def billing_details(self) -> str:
        """Gets the billing_details of this AccountUpdateSetup.


        :return: The billing_details of this AccountUpdateSetup.
        :rtype: str
        """
        return self._billing_details

    @billing_details.setter
    def billing_details(self, billing_details: str):
        """Sets the billing_details of this AccountUpdateSetup.


        :param billing_details: The billing_details of this AccountUpdateSetup.
        :type billing_details: str
        """

        self._billing_details = billing_details

    @property
    def billing_email(self) -> str:
        """Gets the billing_email of this AccountUpdateSetup.


        :return: The billing_email of this AccountUpdateSetup.
        :rtype: str
        """
        return self._billing_email

    @billing_email.setter
    def billing_email(self, billing_email: str):
        """Sets the billing_email of this AccountUpdateSetup.


        :param billing_email: The billing_email of this AccountUpdateSetup.
        :type billing_email: str
        """

        self._billing_email = billing_email

    @property
    def billing_name(self) -> str:
        """Gets the billing_name of this AccountUpdateSetup.


        :return: The billing_name of this AccountUpdateSetup.
        :rtype: str
        """
        return self._billing_name

    @billing_name.setter
    def billing_name(self, billing_name: str):
        """Sets the billing_name of this AccountUpdateSetup.


        :param billing_name: The billing_name of this AccountUpdateSetup.
        :type billing_name: str
        """

        self._billing_name = billing_name

    @property
    def extra_seats_block(self) -> int:
        """Gets the extra_seats_block of this AccountUpdateSetup.


        :return: The extra_seats_block of this AccountUpdateSetup.
        :rtype: int
        """
        return self._extra_seats_block

    @extra_seats_block.setter
    def extra_seats_block(self, extra_seats_block: int):
        """Sets the extra_seats_block of this AccountUpdateSetup.


        :param extra_seats_block: The extra_seats_block of this AccountUpdateSetup.
        :type extra_seats_block: int
        """

        self._extra_seats_block = extra_seats_block

    @property
    def name(self) -> str:
        """Gets the name of this AccountUpdateSetup.


        :return: The name of this AccountUpdateSetup.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this AccountUpdateSetup.


        :param name: The name of this AccountUpdateSetup.
        :type name: str
        """

        self._name = name

    @property
    def slug(self) -> str:
        """Gets the slug of this AccountUpdateSetup.


        :return: The slug of this AccountUpdateSetup.
        :rtype: str
        """
        return self._slug

    @slug.setter
    def slug(self, slug: str):
        """Sets the slug of this AccountUpdateSetup.


        :param slug: The slug of this AccountUpdateSetup.
        :type slug: str
        """

        self._slug = slug

    @property
    def type_id(self) -> str:
        """Gets the type_id of this AccountUpdateSetup.


        :return: The type_id of this AccountUpdateSetup.
        :rtype: str
        """
        return self._type_id

    @type_id.setter
    def type_id(self, type_id: str):
        """Sets the type_id of this AccountUpdateSetup.


        :param type_id: The type_id of this AccountUpdateSetup.
        :type type_id: str
        """

        self._type_id = type_id