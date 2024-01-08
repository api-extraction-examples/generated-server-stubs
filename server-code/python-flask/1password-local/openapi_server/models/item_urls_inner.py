from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ItemUrlsInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, href=None, label=None, primary=None):  # noqa: E501
        """ItemUrlsInner - a model defined in OpenAPI

        :param href: The href of this ItemUrlsInner.  # noqa: E501
        :type href: str
        :param label: The label of this ItemUrlsInner.  # noqa: E501
        :type label: str
        :param primary: The primary of this ItemUrlsInner.  # noqa: E501
        :type primary: bool
        """
        self.openapi_types = {
            'href': str,
            'label': str,
            'primary': bool
        }

        self.attribute_map = {
            'href': 'href',
            'label': 'label',
            'primary': 'primary'
        }

        self._href = href
        self._label = label
        self._primary = primary

    @classmethod
    def from_dict(cls, dikt) -> 'ItemUrlsInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Item_urls_inner of this ItemUrlsInner.  # noqa: E501
        :rtype: ItemUrlsInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def href(self) -> str:
        """Gets the href of this ItemUrlsInner.


        :return: The href of this ItemUrlsInner.
        :rtype: str
        """
        return self._href

    @href.setter
    def href(self, href: str):
        """Sets the href of this ItemUrlsInner.


        :param href: The href of this ItemUrlsInner.
        :type href: str
        """
        if href is None:
            raise ValueError("Invalid value for `href`, must not be `None`")  # noqa: E501

        self._href = href

    @property
    def label(self) -> str:
        """Gets the label of this ItemUrlsInner.


        :return: The label of this ItemUrlsInner.
        :rtype: str
        """
        return self._label

    @label.setter
    def label(self, label: str):
        """Sets the label of this ItemUrlsInner.


        :param label: The label of this ItemUrlsInner.
        :type label: str
        """

        self._label = label

    @property
    def primary(self) -> bool:
        """Gets the primary of this ItemUrlsInner.


        :return: The primary of this ItemUrlsInner.
        :rtype: bool
        """
        return self._primary

    @primary.setter
    def primary(self, primary: bool):
        """Sets the primary of this ItemUrlsInner.


        :param primary: The primary of this ItemUrlsInner.
        :type primary: bool
        """

        self._primary = primary
