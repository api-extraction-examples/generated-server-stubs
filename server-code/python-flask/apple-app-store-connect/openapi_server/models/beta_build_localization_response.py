from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.beta_build_localization import BetaBuildLocalization
from openapi_server.models.build import Build
from openapi_server.models.document_links import DocumentLinks
from openapi_server import util

from openapi_server.models.beta_build_localization import BetaBuildLocalization  # noqa: E501
from openapi_server.models.build import Build  # noqa: E501
from openapi_server.models.document_links import DocumentLinks  # noqa: E501

class BetaBuildLocalizationResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, included=None, links=None):  # noqa: E501
        """BetaBuildLocalizationResponse - a model defined in OpenAPI

        :param data: The data of this BetaBuildLocalizationResponse.  # noqa: E501
        :type data: BetaBuildLocalization
        :param included: The included of this BetaBuildLocalizationResponse.  # noqa: E501
        :type included: List[Build]
        :param links: The links of this BetaBuildLocalizationResponse.  # noqa: E501
        :type links: DocumentLinks
        """
        self.openapi_types = {
            'data': BetaBuildLocalization,
            'included': List[Build],
            'links': DocumentLinks
        }

        self.attribute_map = {
            'data': 'data',
            'included': 'included',
            'links': 'links'
        }

        self._data = data
        self._included = included
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'BetaBuildLocalizationResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaBuildLocalizationResponse of this BetaBuildLocalizationResponse.  # noqa: E501
        :rtype: BetaBuildLocalizationResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> BetaBuildLocalization:
        """Gets the data of this BetaBuildLocalizationResponse.


        :return: The data of this BetaBuildLocalizationResponse.
        :rtype: BetaBuildLocalization
        """
        return self._data

    @data.setter
    def data(self, data: BetaBuildLocalization):
        """Sets the data of this BetaBuildLocalizationResponse.


        :param data: The data of this BetaBuildLocalizationResponse.
        :type data: BetaBuildLocalization
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def included(self) -> List[Build]:
        """Gets the included of this BetaBuildLocalizationResponse.


        :return: The included of this BetaBuildLocalizationResponse.
        :rtype: List[Build]
        """
        return self._included

    @included.setter
    def included(self, included: List[Build]):
        """Sets the included of this BetaBuildLocalizationResponse.


        :param included: The included of this BetaBuildLocalizationResponse.
        :type included: List[Build]
        """

        self._included = included

    @property
    def links(self) -> DocumentLinks:
        """Gets the links of this BetaBuildLocalizationResponse.


        :return: The links of this BetaBuildLocalizationResponse.
        :rtype: DocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: DocumentLinks):
        """Sets the links of this BetaBuildLocalizationResponse.


        :param links: The links of this BetaBuildLocalizationResponse.
        :type links: DocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links
