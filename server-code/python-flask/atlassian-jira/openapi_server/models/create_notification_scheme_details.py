from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.notification_scheme_event_details import NotificationSchemeEventDetails
from openapi_server import util

from openapi_server.models.notification_scheme_event_details import NotificationSchemeEventDetails  # noqa: E501

class CreateNotificationSchemeDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, name=None, notification_scheme_events=None):  # noqa: E501
        """CreateNotificationSchemeDetails - a model defined in OpenAPI

        :param description: The description of this CreateNotificationSchemeDetails.  # noqa: E501
        :type description: str
        :param name: The name of this CreateNotificationSchemeDetails.  # noqa: E501
        :type name: str
        :param notification_scheme_events: The notification_scheme_events of this CreateNotificationSchemeDetails.  # noqa: E501
        :type notification_scheme_events: List[NotificationSchemeEventDetails]
        """
        self.openapi_types = {
            'description': str,
            'name': str,
            'notification_scheme_events': List[NotificationSchemeEventDetails]
        }

        self.attribute_map = {
            'description': 'description',
            'name': 'name',
            'notification_scheme_events': 'notificationSchemeEvents'
        }

        self._description = description
        self._name = name
        self._notification_scheme_events = notification_scheme_events

    @classmethod
    def from_dict(cls, dikt) -> 'CreateNotificationSchemeDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateNotificationSchemeDetails of this CreateNotificationSchemeDetails.  # noqa: E501
        :rtype: CreateNotificationSchemeDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this CreateNotificationSchemeDetails.

        The description of the notification scheme.  # noqa: E501

        :return: The description of this CreateNotificationSchemeDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this CreateNotificationSchemeDetails.

        The description of the notification scheme.  # noqa: E501

        :param description: The description of this CreateNotificationSchemeDetails.
        :type description: str
        """
        if description is not None and len(description) > 4000:
            raise ValueError("Invalid value for `description`, length must be less than or equal to `4000`")  # noqa: E501

        self._description = description

    @property
    def name(self) -> str:
        """Gets the name of this CreateNotificationSchemeDetails.

        The name of the notification scheme. Must be unique (case-insensitive).  # noqa: E501

        :return: The name of this CreateNotificationSchemeDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this CreateNotificationSchemeDetails.

        The name of the notification scheme. Must be unique (case-insensitive).  # noqa: E501

        :param name: The name of this CreateNotificationSchemeDetails.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501
        if name is not None and len(name) > 255:
            raise ValueError("Invalid value for `name`, length must be less than or equal to `255`")  # noqa: E501

        self._name = name

    @property
    def notification_scheme_events(self) -> List[NotificationSchemeEventDetails]:
        """Gets the notification_scheme_events of this CreateNotificationSchemeDetails.

        The list of notifications which should be added to the notification scheme.  # noqa: E501

        :return: The notification_scheme_events of this CreateNotificationSchemeDetails.
        :rtype: List[NotificationSchemeEventDetails]
        """
        return self._notification_scheme_events

    @notification_scheme_events.setter
    def notification_scheme_events(self, notification_scheme_events: List[NotificationSchemeEventDetails]):
        """Sets the notification_scheme_events of this CreateNotificationSchemeDetails.

        The list of notifications which should be added to the notification scheme.  # noqa: E501

        :param notification_scheme_events: The notification_scheme_events of this CreateNotificationSchemeDetails.
        :type notification_scheme_events: List[NotificationSchemeEventDetails]
        """

        self._notification_scheme_events = notification_scheme_events