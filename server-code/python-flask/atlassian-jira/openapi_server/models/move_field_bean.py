from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class MoveFieldBean(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, after=None, position=None):  # noqa: E501
        """MoveFieldBean - a model defined in OpenAPI

        :param after: The after of this MoveFieldBean.  # noqa: E501
        :type after: str
        :param position: The position of this MoveFieldBean.  # noqa: E501
        :type position: str
        """
        self.openapi_types = {
            'after': str,
            'position': str
        }

        self.attribute_map = {
            'after': 'after',
            'position': 'position'
        }

        self._after = after
        self._position = position

    @classmethod
    def from_dict(cls, dikt) -> 'MoveFieldBean':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MoveFieldBean of this MoveFieldBean.  # noqa: E501
        :rtype: MoveFieldBean
        """
        return util.deserialize_model(dikt, cls)

    @property
    def after(self) -> str:
        """Gets the after of this MoveFieldBean.

        The ID of the screen tab field after which to place the moved screen tab field. Required if `position` isn't provided.  # noqa: E501

        :return: The after of this MoveFieldBean.
        :rtype: str
        """
        return self._after

    @after.setter
    def after(self, after: str):
        """Sets the after of this MoveFieldBean.

        The ID of the screen tab field after which to place the moved screen tab field. Required if `position` isn't provided.  # noqa: E501

        :param after: The after of this MoveFieldBean.
        :type after: str
        """

        self._after = after

    @property
    def position(self) -> str:
        """Gets the position of this MoveFieldBean.

        The named position to which the screen tab field should be moved. Required if `after` isn't provided.  # noqa: E501

        :return: The position of this MoveFieldBean.
        :rtype: str
        """
        return self._position

    @position.setter
    def position(self, position: str):
        """Sets the position of this MoveFieldBean.

        The named position to which the screen tab field should be moved. Required if `after` isn't provided.  # noqa: E501

        :param position: The position of this MoveFieldBean.
        :type position: str
        """
        allowed_values = ["Earlier", "Later", "First", "Last"]  # noqa: E501
        if position not in allowed_values:
            raise ValueError(
                "Invalid value for `position` ({0}), must be one of {1}"
                .format(position, allowed_values)
            )

        self._position = position
