from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class IconBean(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, link=None, title=None, url16x16=None):  # noqa: E501
        """IconBean - a model defined in OpenAPI

        :param link: The link of this IconBean.  # noqa: E501
        :type link: str
        :param title: The title of this IconBean.  # noqa: E501
        :type title: str
        :param url16x16: The url16x16 of this IconBean.  # noqa: E501
        :type url16x16: str
        """
        self.openapi_types = {
            'link': str,
            'title': str,
            'url16x16': str
        }

        self.attribute_map = {
            'link': 'link',
            'title': 'title',
            'url16x16': 'url16x16'
        }

        self._link = link
        self._title = title
        self._url16x16 = url16x16

    @classmethod
    def from_dict(cls, dikt) -> 'IconBean':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The IconBean of this IconBean.  # noqa: E501
        :rtype: IconBean
        """
        return util.deserialize_model(dikt, cls)

    @property
    def link(self) -> str:
        """Gets the link of this IconBean.

        The URL of the tooltip, used only for a status icon.  # noqa: E501

        :return: The link of this IconBean.
        :rtype: str
        """
        return self._link

    @link.setter
    def link(self, link: str):
        """Sets the link of this IconBean.

        The URL of the tooltip, used only for a status icon.  # noqa: E501

        :param link: The link of this IconBean.
        :type link: str
        """

        self._link = link

    @property
    def title(self) -> str:
        """Gets the title of this IconBean.

        The title of the icon, for use as a tooltip on the icon.  # noqa: E501

        :return: The title of this IconBean.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this IconBean.

        The title of the icon, for use as a tooltip on the icon.  # noqa: E501

        :param title: The title of this IconBean.
        :type title: str
        """

        self._title = title

    @property
    def url16x16(self) -> str:
        """Gets the url16x16 of this IconBean.

        The URL of a 16x16 pixel icon.  # noqa: E501

        :return: The url16x16 of this IconBean.
        :rtype: str
        """
        return self._url16x16

    @url16x16.setter
    def url16x16(self, url16x16: str):
        """Sets the url16x16 of this IconBean.

        The URL of a 16x16 pixel icon.  # noqa: E501

        :param url16x16: The url16x16 of this IconBean.
        :type url16x16: str
        """

        self._url16x16 = url16x16