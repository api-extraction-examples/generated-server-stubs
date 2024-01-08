from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PathSubstitution(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _from=None, to=None):  # noqa: E501
        """PathSubstitution - a model defined in OpenAPI

        :param _from: The _from of this PathSubstitution.  # noqa: E501
        :type _from: str
        :param to: The to of this PathSubstitution.  # noqa: E501
        :type to: str
        """
        self.openapi_types = {
            '_from': str,
            'to': str
        }

        self.attribute_map = {
            '_from': 'From',
            'to': 'To'
        }

        self.__from = _from
        self._to = to

    @classmethod
    def from_dict(cls, dikt) -> 'PathSubstitution':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PathSubstitution of this PathSubstitution.  # noqa: E501
        :rtype: PathSubstitution
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _from(self) -> str:
        """Gets the _from of this PathSubstitution.

        Gets or sets the value to substitute.  # noqa: E501

        :return: The _from of this PathSubstitution.
        :rtype: str
        """
        return self.__from

    @_from.setter
    def _from(self, _from: str):
        """Sets the _from of this PathSubstitution.

        Gets or sets the value to substitute.  # noqa: E501

        :param _from: The _from of this PathSubstitution.
        :type _from: str
        """

        self.__from = _from

    @property
    def to(self) -> str:
        """Gets the to of this PathSubstitution.

        Gets or sets the value to substitution with.  # noqa: E501

        :return: The to of this PathSubstitution.
        :rtype: str
        """
        return self._to

    @to.setter
    def to(self, to: str):
        """Sets the to of this PathSubstitution.

        Gets or sets the value to substitution with.  # noqa: E501

        :param to: The to of this PathSubstitution.
        :type to: str
        """

        self._to = to
