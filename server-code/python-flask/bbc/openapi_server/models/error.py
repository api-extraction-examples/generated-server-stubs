from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Error(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, href=None, id=None, message=None, replied_at=None):  # noqa: E501
        """Error - a model defined in OpenAPI

        :param href: The href of this Error.  # noqa: E501
        :type href: str
        :param id: The id of this Error.  # noqa: E501
        :type id: str
        :param message: The message of this Error.  # noqa: E501
        :type message: str
        :param replied_at: The replied_at of this Error.  # noqa: E501
        :type replied_at: str
        """
        self.openapi_types = {
            'href': str,
            'id': str,
            'message': str,
            'replied_at': str
        }

        self.attribute_map = {
            'href': 'href',
            'id': 'id',
            'message': 'message',
            'replied_at': 'replied_at'
        }

        self._href = href
        self._id = id
        self._message = message
        self._replied_at = replied_at

    @classmethod
    def from_dict(cls, dikt) -> 'Error':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Error of this Error.  # noqa: E501
        :rtype: Error
        """
        return util.deserialize_model(dikt, cls)

    @property
    def href(self) -> str:
        """Gets the href of this Error.


        :return: The href of this Error.
        :rtype: str
        """
        return self._href

    @href.setter
    def href(self, href: str):
        """Sets the href of this Error.


        :param href: The href of this Error.
        :type href: str
        """
        if href is None:
            raise ValueError("Invalid value for `href`, must not be `None`")  # noqa: E501

        self._href = href

    @property
    def id(self) -> str:
        """Gets the id of this Error.


        :return: The id of this Error.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this Error.


        :param id: The id of this Error.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def message(self) -> str:
        """Gets the message of this Error.


        :return: The message of this Error.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message: str):
        """Sets the message of this Error.


        :param message: The message of this Error.
        :type message: str
        """
        if message is None:
            raise ValueError("Invalid value for `message`, must not be `None`")  # noqa: E501

        self._message = message

    @property
    def replied_at(self) -> str:
        """Gets the replied_at of this Error.


        :return: The replied_at of this Error.
        :rtype: str
        """
        return self._replied_at

    @replied_at.setter
    def replied_at(self, replied_at: str):
        """Sets the replied_at of this Error.


        :param replied_at: The replied_at of this Error.
        :type replied_at: str
        """
        if replied_at is None:
            raise ValueError("Invalid value for `replied_at`, must not be `None`")  # noqa: E501

        self._replied_at = replied_at