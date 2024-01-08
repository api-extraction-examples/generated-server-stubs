from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PersonalisedMusicError(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, message=None, replied_at=None, status=None):  # noqa: E501
        """PersonalisedMusicError - a model defined in OpenAPI

        :param message: The message of this PersonalisedMusicError.  # noqa: E501
        :type message: str
        :param replied_at: The replied_at of this PersonalisedMusicError.  # noqa: E501
        :type replied_at: int
        :param status: The status of this PersonalisedMusicError.  # noqa: E501
        :type status: int
        """
        self.openapi_types = {
            'message': str,
            'replied_at': int,
            'status': int
        }

        self.attribute_map = {
            'message': 'message',
            'replied_at': 'replied_at',
            'status': 'status'
        }

        self._message = message
        self._replied_at = replied_at
        self._status = status

    @classmethod
    def from_dict(cls, dikt) -> 'PersonalisedMusicError':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PersonalisedMusicError of this PersonalisedMusicError.  # noqa: E501
        :rtype: PersonalisedMusicError
        """
        return util.deserialize_model(dikt, cls)

    @property
    def message(self) -> str:
        """Gets the message of this PersonalisedMusicError.


        :return: The message of this PersonalisedMusicError.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message: str):
        """Sets the message of this PersonalisedMusicError.


        :param message: The message of this PersonalisedMusicError.
        :type message: str
        """
        if message is None:
            raise ValueError("Invalid value for `message`, must not be `None`")  # noqa: E501

        self._message = message

    @property
    def replied_at(self) -> int:
        """Gets the replied_at of this PersonalisedMusicError.


        :return: The replied_at of this PersonalisedMusicError.
        :rtype: int
        """
        return self._replied_at

    @replied_at.setter
    def replied_at(self, replied_at: int):
        """Sets the replied_at of this PersonalisedMusicError.


        :param replied_at: The replied_at of this PersonalisedMusicError.
        :type replied_at: int
        """
        if replied_at is None:
            raise ValueError("Invalid value for `replied_at`, must not be `None`")  # noqa: E501

        self._replied_at = replied_at

    @property
    def status(self) -> int:
        """Gets the status of this PersonalisedMusicError.


        :return: The status of this PersonalisedMusicError.
        :rtype: int
        """
        return self._status

    @status.setter
    def status(self, status: int):
        """Sets the status of this PersonalisedMusicError.


        :param status: The status of this PersonalisedMusicError.
        :type status: int
        """
        if status is None:
            raise ValueError("Invalid value for `status`, must not be `None`")  # noqa: E501

        self._status = status
