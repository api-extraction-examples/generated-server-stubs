from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.event_notification import EventNotification
from openapi_server.models.notification_event import NotificationEvent
from openapi_server import util

from openapi_server.models.event_notification import EventNotification  # noqa: E501
from openapi_server.models.notification_event import NotificationEvent  # noqa: E501

class NotificationSchemeEvent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, event=None, notifications=None):  # noqa: E501
        """NotificationSchemeEvent - a model defined in OpenAPI

        :param event: The event of this NotificationSchemeEvent.  # noqa: E501
        :type event: NotificationEvent
        :param notifications: The notifications of this NotificationSchemeEvent.  # noqa: E501
        :type notifications: List[EventNotification]
        """
        self.openapi_types = {
            'event': NotificationEvent,
            'notifications': List[EventNotification]
        }

        self.attribute_map = {
            'event': 'event',
            'notifications': 'notifications'
        }

        self._event = event
        self._notifications = notifications

    @classmethod
    def from_dict(cls, dikt) -> 'NotificationSchemeEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The NotificationSchemeEvent of this NotificationSchemeEvent.  # noqa: E501
        :rtype: NotificationSchemeEvent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def event(self) -> NotificationEvent:
        """Gets the event of this NotificationSchemeEvent.


        :return: The event of this NotificationSchemeEvent.
        :rtype: NotificationEvent
        """
        return self._event

    @event.setter
    def event(self, event: NotificationEvent):
        """Sets the event of this NotificationSchemeEvent.


        :param event: The event of this NotificationSchemeEvent.
        :type event: NotificationEvent
        """

        self._event = event

    @property
    def notifications(self) -> List[EventNotification]:
        """Gets the notifications of this NotificationSchemeEvent.


        :return: The notifications of this NotificationSchemeEvent.
        :rtype: List[EventNotification]
        """
        return self._notifications

    @notifications.setter
    def notifications(self, notifications: List[EventNotification]):
        """Sets the notifications of this NotificationSchemeEvent.


        :param notifications: The notifications of this NotificationSchemeEvent.
        :type notifications: List[EventNotification]
        """

        self._notifications = notifications
