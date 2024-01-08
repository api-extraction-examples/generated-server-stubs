from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class AppStoreVersionLocalizationAttributes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, keywords=None, locale=None, marketing_url=None, promotional_text=None, support_url=None, whats_new=None):  # noqa: E501
        """AppStoreVersionLocalizationAttributes - a model defined in OpenAPI

        :param description: The description of this AppStoreVersionLocalizationAttributes.  # noqa: E501
        :type description: str
        :param keywords: The keywords of this AppStoreVersionLocalizationAttributes.  # noqa: E501
        :type keywords: str
        :param locale: The locale of this AppStoreVersionLocalizationAttributes.  # noqa: E501
        :type locale: str
        :param marketing_url: The marketing_url of this AppStoreVersionLocalizationAttributes.  # noqa: E501
        :type marketing_url: str
        :param promotional_text: The promotional_text of this AppStoreVersionLocalizationAttributes.  # noqa: E501
        :type promotional_text: str
        :param support_url: The support_url of this AppStoreVersionLocalizationAttributes.  # noqa: E501
        :type support_url: str
        :param whats_new: The whats_new of this AppStoreVersionLocalizationAttributes.  # noqa: E501
        :type whats_new: str
        """
        self.openapi_types = {
            'description': str,
            'keywords': str,
            'locale': str,
            'marketing_url': str,
            'promotional_text': str,
            'support_url': str,
            'whats_new': str
        }

        self.attribute_map = {
            'description': 'description',
            'keywords': 'keywords',
            'locale': 'locale',
            'marketing_url': 'marketingUrl',
            'promotional_text': 'promotionalText',
            'support_url': 'supportUrl',
            'whats_new': 'whatsNew'
        }

        self._description = description
        self._keywords = keywords
        self._locale = locale
        self._marketing_url = marketing_url
        self._promotional_text = promotional_text
        self._support_url = support_url
        self._whats_new = whats_new

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreVersionLocalizationAttributes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreVersionLocalization_attributes of this AppStoreVersionLocalizationAttributes.  # noqa: E501
        :rtype: AppStoreVersionLocalizationAttributes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this AppStoreVersionLocalizationAttributes.


        :return: The description of this AppStoreVersionLocalizationAttributes.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this AppStoreVersionLocalizationAttributes.


        :param description: The description of this AppStoreVersionLocalizationAttributes.
        :type description: str
        """

        self._description = description

    @property
    def keywords(self) -> str:
        """Gets the keywords of this AppStoreVersionLocalizationAttributes.


        :return: The keywords of this AppStoreVersionLocalizationAttributes.
        :rtype: str
        """
        return self._keywords

    @keywords.setter
    def keywords(self, keywords: str):
        """Sets the keywords of this AppStoreVersionLocalizationAttributes.


        :param keywords: The keywords of this AppStoreVersionLocalizationAttributes.
        :type keywords: str
        """

        self._keywords = keywords

    @property
    def locale(self) -> str:
        """Gets the locale of this AppStoreVersionLocalizationAttributes.


        :return: The locale of this AppStoreVersionLocalizationAttributes.
        :rtype: str
        """
        return self._locale

    @locale.setter
    def locale(self, locale: str):
        """Sets the locale of this AppStoreVersionLocalizationAttributes.


        :param locale: The locale of this AppStoreVersionLocalizationAttributes.
        :type locale: str
        """

        self._locale = locale

    @property
    def marketing_url(self) -> str:
        """Gets the marketing_url of this AppStoreVersionLocalizationAttributes.


        :return: The marketing_url of this AppStoreVersionLocalizationAttributes.
        :rtype: str
        """
        return self._marketing_url

    @marketing_url.setter
    def marketing_url(self, marketing_url: str):
        """Sets the marketing_url of this AppStoreVersionLocalizationAttributes.


        :param marketing_url: The marketing_url of this AppStoreVersionLocalizationAttributes.
        :type marketing_url: str
        """

        self._marketing_url = marketing_url

    @property
    def promotional_text(self) -> str:
        """Gets the promotional_text of this AppStoreVersionLocalizationAttributes.


        :return: The promotional_text of this AppStoreVersionLocalizationAttributes.
        :rtype: str
        """
        return self._promotional_text

    @promotional_text.setter
    def promotional_text(self, promotional_text: str):
        """Sets the promotional_text of this AppStoreVersionLocalizationAttributes.


        :param promotional_text: The promotional_text of this AppStoreVersionLocalizationAttributes.
        :type promotional_text: str
        """

        self._promotional_text = promotional_text

    @property
    def support_url(self) -> str:
        """Gets the support_url of this AppStoreVersionLocalizationAttributes.


        :return: The support_url of this AppStoreVersionLocalizationAttributes.
        :rtype: str
        """
        return self._support_url

    @support_url.setter
    def support_url(self, support_url: str):
        """Sets the support_url of this AppStoreVersionLocalizationAttributes.


        :param support_url: The support_url of this AppStoreVersionLocalizationAttributes.
        :type support_url: str
        """

        self._support_url = support_url

    @property
    def whats_new(self) -> str:
        """Gets the whats_new of this AppStoreVersionLocalizationAttributes.


        :return: The whats_new of this AppStoreVersionLocalizationAttributes.
        :rtype: str
        """
        return self._whats_new

    @whats_new.setter
    def whats_new(self, whats_new: str):
        """Sets the whats_new of this AppStoreVersionLocalizationAttributes.


        :param whats_new: The whats_new of this AppStoreVersionLocalizationAttributes.
        :type whats_new: str
        """

        self._whats_new = whats_new
