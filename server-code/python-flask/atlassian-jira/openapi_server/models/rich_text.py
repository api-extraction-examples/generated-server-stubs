from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class RichText(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, empty=None, empty_adf=None, finalised=None, value_set=None):  # noqa: E501
        """RichText - a model defined in OpenAPI

        :param empty: The empty of this RichText.  # noqa: E501
        :type empty: bool
        :param empty_adf: The empty_adf of this RichText.  # noqa: E501
        :type empty_adf: bool
        :param finalised: The finalised of this RichText.  # noqa: E501
        :type finalised: bool
        :param value_set: The value_set of this RichText.  # noqa: E501
        :type value_set: bool
        """
        self.openapi_types = {
            'empty': bool,
            'empty_adf': bool,
            'finalised': bool,
            'value_set': bool
        }

        self.attribute_map = {
            'empty': 'empty',
            'empty_adf': 'emptyAdf',
            'finalised': 'finalised',
            'value_set': 'valueSet'
        }

        self._empty = empty
        self._empty_adf = empty_adf
        self._finalised = finalised
        self._value_set = value_set

    @classmethod
    def from_dict(cls, dikt) -> 'RichText':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RichText of this RichText.  # noqa: E501
        :rtype: RichText
        """
        return util.deserialize_model(dikt, cls)

    @property
    def empty(self) -> bool:
        """Gets the empty of this RichText.


        :return: The empty of this RichText.
        :rtype: bool
        """
        return self._empty

    @empty.setter
    def empty(self, empty: bool):
        """Sets the empty of this RichText.


        :param empty: The empty of this RichText.
        :type empty: bool
        """

        self._empty = empty

    @property
    def empty_adf(self) -> bool:
        """Gets the empty_adf of this RichText.


        :return: The empty_adf of this RichText.
        :rtype: bool
        """
        return self._empty_adf

    @empty_adf.setter
    def empty_adf(self, empty_adf: bool):
        """Sets the empty_adf of this RichText.


        :param empty_adf: The empty_adf of this RichText.
        :type empty_adf: bool
        """

        self._empty_adf = empty_adf

    @property
    def finalised(self) -> bool:
        """Gets the finalised of this RichText.


        :return: The finalised of this RichText.
        :rtype: bool
        """
        return self._finalised

    @finalised.setter
    def finalised(self, finalised: bool):
        """Sets the finalised of this RichText.


        :param finalised: The finalised of this RichText.
        :type finalised: bool
        """

        self._finalised = finalised

    @property
    def value_set(self) -> bool:
        """Gets the value_set of this RichText.


        :return: The value_set of this RichText.
        :rtype: bool
        """
        return self._value_set

    @value_set.setter
    def value_set(self, value_set: bool):
        """Sets the value_set of this RichText.


        :param value_set: The value_set of this RichText.
        :type value_set: bool
        """

        self._value_set = value_set
