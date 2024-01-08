from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.notification_level import NotificationLevel
from openapi_server import util

from openapi_server.models.notification_level import NotificationLevel  # noqa: E501

class NotificationsSummaryDto(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, max_unread_notification_level=None, unread_count=None):  # noqa: E501
        """NotificationsSummaryDto - a model defined in OpenAPI

        :param max_unread_notification_level: The max_unread_notification_level of this NotificationsSummaryDto.  # noqa: E501
        :type max_unread_notification_level: NotificationLevel
        :param unread_count: The unread_count of this NotificationsSummaryDto.  # noqa: E501
        :type unread_count: int
        """
        self.openapi_types = {
            'max_unread_notification_level': NotificationLevel,
            'unread_count': int
        }

        self.attribute_map = {
            'max_unread_notification_level': 'MaxUnreadNotificationLevel',
            'unread_count': 'UnreadCount'
        }

        self._max_unread_notification_level = max_unread_notification_level
        self._unread_count = unread_count

    @classmethod
    def from_dict(cls, dikt) -> 'NotificationsSummaryDto':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The NotificationsSummaryDto of this NotificationsSummaryDto.  # noqa: E501
        :rtype: NotificationsSummaryDto
        """
        return util.deserialize_model(dikt, cls)

    @property
    def max_unread_notification_level(self) -> NotificationLevel:
        """Gets the max_unread_notification_level of this NotificationsSummaryDto.


        :return: The max_unread_notification_level of this NotificationsSummaryDto.
        :rtype: NotificationLevel
        """
        return self._max_unread_notification_level

    @max_unread_notification_level.setter
    def max_unread_notification_level(self, max_unread_notification_level: NotificationLevel):
        """Sets the max_unread_notification_level of this NotificationsSummaryDto.


        :param max_unread_notification_level: The max_unread_notification_level of this NotificationsSummaryDto.
        :type max_unread_notification_level: NotificationLevel
        """

        self._max_unread_notification_level = max_unread_notification_level

    @property
    def unread_count(self) -> int:
        """Gets the unread_count of this NotificationsSummaryDto.

        Gets or sets the number of unread notifications.  # noqa: E501

        :return: The unread_count of this NotificationsSummaryDto.
        :rtype: int
        """
        return self._unread_count

    @unread_count.setter
    def unread_count(self, unread_count: int):
        """Sets the unread_count of this NotificationsSummaryDto.

        Gets or sets the number of unread notifications.  # noqa: E501

        :param unread_count: The unread_count of this NotificationsSummaryDto.
        :type unread_count: int
        """

        self._unread_count = unread_count