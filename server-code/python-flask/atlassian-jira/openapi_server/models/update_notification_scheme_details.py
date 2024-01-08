from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class UpdateNotificationSchemeDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, name=None):  # noqa: E501
        """UpdateNotificationSchemeDetails - a model defined in OpenAPI

        :param description: The description of this UpdateNotificationSchemeDetails.  # noqa: E501
        :type description: str
        :param name: The name of this UpdateNotificationSchemeDetails.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'description': str,
            'name': str
        }

        self.attribute_map = {
            'description': 'description',
            'name': 'name'
        }

        self._description = description
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateNotificationSchemeDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdateNotificationSchemeDetails of this UpdateNotificationSchemeDetails.  # noqa: E501
        :rtype: UpdateNotificationSchemeDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this UpdateNotificationSchemeDetails.

        The description of the notification scheme.  # noqa: E501

        :return: The description of this UpdateNotificationSchemeDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this UpdateNotificationSchemeDetails.

        The description of the notification scheme.  # noqa: E501

        :param description: The description of this UpdateNotificationSchemeDetails.
        :type description: str
        """
        if description is not None and len(description) > 4000:
            raise ValueError("Invalid value for `description`, length must be less than or equal to `4000`")  # noqa: E501

        self._description = description

    @property
    def name(self) -> str:
        """Gets the name of this UpdateNotificationSchemeDetails.

        The name of the notification scheme. Must be unique.  # noqa: E501

        :return: The name of this UpdateNotificationSchemeDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this UpdateNotificationSchemeDetails.

        The name of the notification scheme. Must be unique.  # noqa: E501

        :param name: The name of this UpdateNotificationSchemeDetails.
        :type name: str
        """
        if name is not None and len(name) > 255:
            raise ValueError("Invalid value for `name`, length must be less than or equal to `255`")  # noqa: E501

        self._name = name