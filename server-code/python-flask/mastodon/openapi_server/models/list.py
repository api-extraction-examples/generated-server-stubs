from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class List(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, replies_policy=None, title=None):  # noqa: E501
        """List - a model defined in OpenAPI

        :param id: The id of this List.  # noqa: E501
        :type id: str
        :param replies_policy: The replies_policy of this List.  # noqa: E501
        :type replies_policy: str
        :param title: The title of this List.  # noqa: E501
        :type title: str
        """
        self.openapi_types = {
            'id': str,
            'replies_policy': str,
            'title': str
        }

        self.attribute_map = {
            'id': 'id',
            'replies_policy': 'replies_policy',
            'title': 'title'
        }

        self._id = id
        self._replies_policy = replies_policy
        self._title = title

    @classmethod
    def from_dict(cls, dikt) -> 'List':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The List of this List.  # noqa: E501
        :rtype: List
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this List.

        The internal database ID of the list. Cast from an integer, but not guaranteed to be a number.  # noqa: E501

        :return: The id of this List.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this List.

        The internal database ID of the list. Cast from an integer, but not guaranteed to be a number.  # noqa: E501

        :param id: The id of this List.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def replies_policy(self) -> str:
        """Gets the replies_policy of this List.

        The user-defined title of the list.  # noqa: E501

        :return: The replies_policy of this List.
        :rtype: str
        """
        return self._replies_policy

    @replies_policy.setter
    def replies_policy(self, replies_policy: str):
        """Sets the replies_policy of this List.

        The user-defined title of the list.  # noqa: E501

        :param replies_policy: The replies_policy of this List.
        :type replies_policy: str
        """
        allowed_values = ["followed", "list", "none"]  # noqa: E501
        if replies_policy not in allowed_values:
            raise ValueError(
                "Invalid value for `replies_policy` ({0}), must be one of {1}"
                .format(replies_policy, allowed_values)
            )

        self._replies_policy = replies_policy

    @property
    def title(self) -> str:
        """Gets the title of this List.

        The user-defined title of the list.  # noqa: E501

        :return: The title of this List.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this List.

        The user-defined title of the list.  # noqa: E501

        :param title: The title of this List.
        :type title: str
        """
        if title is None:
            raise ValueError("Invalid value for `title`, must not be `None`")  # noqa: E501

        self._title = title
