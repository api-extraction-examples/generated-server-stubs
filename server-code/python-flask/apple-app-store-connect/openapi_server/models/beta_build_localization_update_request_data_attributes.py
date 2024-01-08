from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class BetaBuildLocalizationUpdateRequestDataAttributes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, whats_new=None):  # noqa: E501
        """BetaBuildLocalizationUpdateRequestDataAttributes - a model defined in OpenAPI

        :param whats_new: The whats_new of this BetaBuildLocalizationUpdateRequestDataAttributes.  # noqa: E501
        :type whats_new: str
        """
        self.openapi_types = {
            'whats_new': str
        }

        self.attribute_map = {
            'whats_new': 'whatsNew'
        }

        self._whats_new = whats_new

    @classmethod
    def from_dict(cls, dikt) -> 'BetaBuildLocalizationUpdateRequestDataAttributes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaBuildLocalizationUpdateRequest_data_attributes of this BetaBuildLocalizationUpdateRequestDataAttributes.  # noqa: E501
        :rtype: BetaBuildLocalizationUpdateRequestDataAttributes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def whats_new(self) -> str:
        """Gets the whats_new of this BetaBuildLocalizationUpdateRequestDataAttributes.


        :return: The whats_new of this BetaBuildLocalizationUpdateRequestDataAttributes.
        :rtype: str
        """
        return self._whats_new

    @whats_new.setter
    def whats_new(self, whats_new: str):
        """Sets the whats_new of this BetaBuildLocalizationUpdateRequestDataAttributes.


        :param whats_new: The whats_new of this BetaBuildLocalizationUpdateRequestDataAttributes.
        :type whats_new: str
        """

        self._whats_new = whats_new