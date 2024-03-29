from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Position(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, x=None, y=None):  # noqa: E501
        """Position - a model defined in OpenAPI

        :param x: The x of this Position.  # noqa: E501
        :type x: float
        :param y: The y of this Position.  # noqa: E501
        :type y: float
        """
        self.openapi_types = {
            'x': float,
            'y': float
        }

        self.attribute_map = {
            'x': 'x',
            'y': 'y'
        }

        self._x = x
        self._y = y

    @classmethod
    def from_dict(cls, dikt) -> 'Position':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Position of this Position.  # noqa: E501
        :rtype: Position
        """
        return util.deserialize_model(dikt, cls)

    @property
    def x(self) -> float:
        """Gets the x of this Position.

        X position (horizontal)  # noqa: E501

        :return: The x of this Position.
        :rtype: float
        """
        return self._x

    @x.setter
    def x(self, x: float):
        """Sets the x of this Position.

        X position (horizontal)  # noqa: E501

        :param x: The x of this Position.
        :type x: float
        """

        self._x = x

    @property
    def y(self) -> float:
        """Gets the y of this Position.

        Y position (vertical)  # noqa: E501

        :return: The y of this Position.
        :rtype: float
        """
        return self._y

    @y.setter
    def y(self, y: float):
        """Sets the y of this Position.

        Y position (vertical)  # noqa: E501

        :param y: The y of this Position.
        :type y: float
        """

        self._y = y
