from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class SiteProcessingSettingsHtml(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pretty_urls=None):  # noqa: E501
        """SiteProcessingSettingsHtml - a model defined in OpenAPI

        :param pretty_urls: The pretty_urls of this SiteProcessingSettingsHtml.  # noqa: E501
        :type pretty_urls: bool
        """
        self.openapi_types = {
            'pretty_urls': bool
        }

        self.attribute_map = {
            'pretty_urls': 'pretty_urls'
        }

        self._pretty_urls = pretty_urls

    @classmethod
    def from_dict(cls, dikt) -> 'SiteProcessingSettingsHtml':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The site_processing_settings_html of this SiteProcessingSettingsHtml.  # noqa: E501
        :rtype: SiteProcessingSettingsHtml
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pretty_urls(self) -> bool:
        """Gets the pretty_urls of this SiteProcessingSettingsHtml.


        :return: The pretty_urls of this SiteProcessingSettingsHtml.
        :rtype: bool
        """
        return self._pretty_urls

    @pretty_urls.setter
    def pretty_urls(self, pretty_urls: bool):
        """Sets the pretty_urls of this SiteProcessingSettingsHtml.


        :param pretty_urls: The pretty_urls of this SiteProcessingSettingsHtml.
        :type pretty_urls: bool
        """

        self._pretty_urls = pretty_urls
