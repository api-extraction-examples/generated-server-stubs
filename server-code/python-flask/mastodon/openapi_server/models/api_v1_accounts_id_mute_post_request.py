from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ApiV1AccountsIdMutePostRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, duration=0, notifications=True):  # noqa: E501
        """ApiV1AccountsIdMutePostRequest - a model defined in OpenAPI

        :param duration: The duration of this ApiV1AccountsIdMutePostRequest.  # noqa: E501
        :type duration: int
        :param notifications: The notifications of this ApiV1AccountsIdMutePostRequest.  # noqa: E501
        :type notifications: bool
        """
        self.openapi_types = {
            'duration': int,
            'notifications': bool
        }

        self.attribute_map = {
            'duration': 'duration',
            'notifications': 'notifications'
        }

        self._duration = duration
        self._notifications = notifications

    @classmethod
    def from_dict(cls, dikt) -> 'ApiV1AccountsIdMutePostRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The _api_v1_accounts__id__mute_post_request of this ApiV1AccountsIdMutePostRequest.  # noqa: E501
        :rtype: ApiV1AccountsIdMutePostRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def duration(self) -> int:
        """Gets the duration of this ApiV1AccountsIdMutePostRequest.

        How long the mute should last, in seconds. Defaults to 0 (indefinite).  # noqa: E501

        :return: The duration of this ApiV1AccountsIdMutePostRequest.
        :rtype: int
        """
        return self._duration

    @duration.setter
    def duration(self, duration: int):
        """Sets the duration of this ApiV1AccountsIdMutePostRequest.

        How long the mute should last, in seconds. Defaults to 0 (indefinite).  # noqa: E501

        :param duration: The duration of this ApiV1AccountsIdMutePostRequest.
        :type duration: int
        """

        self._duration = duration

    @property
    def notifications(self) -> bool:
        """Gets the notifications of this ApiV1AccountsIdMutePostRequest.

        Mute notifications in addition to statuses? Defaults to true.  # noqa: E501

        :return: The notifications of this ApiV1AccountsIdMutePostRequest.
        :rtype: bool
        """
        return self._notifications

    @notifications.setter
    def notifications(self, notifications: bool):
        """Sets the notifications of this ApiV1AccountsIdMutePostRequest.

        Mute notifications in addition to statuses? Defaults to true.  # noqa: E501

        :param notifications: The notifications of this ApiV1AccountsIdMutePostRequest.
        :type notifications: bool
        """

        self._notifications = notifications
