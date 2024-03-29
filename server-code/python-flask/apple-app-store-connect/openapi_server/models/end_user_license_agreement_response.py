from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.document_links import DocumentLinks
from openapi_server.models.end_user_license_agreement import EndUserLicenseAgreement
from openapi_server.models.territory import Territory
from openapi_server import util

from openapi_server.models.document_links import DocumentLinks  # noqa: E501
from openapi_server.models.end_user_license_agreement import EndUserLicenseAgreement  # noqa: E501
from openapi_server.models.territory import Territory  # noqa: E501

class EndUserLicenseAgreementResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, included=None, links=None):  # noqa: E501
        """EndUserLicenseAgreementResponse - a model defined in OpenAPI

        :param data: The data of this EndUserLicenseAgreementResponse.  # noqa: E501
        :type data: EndUserLicenseAgreement
        :param included: The included of this EndUserLicenseAgreementResponse.  # noqa: E501
        :type included: List[Territory]
        :param links: The links of this EndUserLicenseAgreementResponse.  # noqa: E501
        :type links: DocumentLinks
        """
        self.openapi_types = {
            'data': EndUserLicenseAgreement,
            'included': List[Territory],
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
    def from_dict(cls, dikt) -> 'EndUserLicenseAgreementResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EndUserLicenseAgreementResponse of this EndUserLicenseAgreementResponse.  # noqa: E501
        :rtype: EndUserLicenseAgreementResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> EndUserLicenseAgreement:
        """Gets the data of this EndUserLicenseAgreementResponse.


        :return: The data of this EndUserLicenseAgreementResponse.
        :rtype: EndUserLicenseAgreement
        """
        return self._data

    @data.setter
    def data(self, data: EndUserLicenseAgreement):
        """Sets the data of this EndUserLicenseAgreementResponse.


        :param data: The data of this EndUserLicenseAgreementResponse.
        :type data: EndUserLicenseAgreement
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def included(self) -> List[Territory]:
        """Gets the included of this EndUserLicenseAgreementResponse.


        :return: The included of this EndUserLicenseAgreementResponse.
        :rtype: List[Territory]
        """
        return self._included

    @included.setter
    def included(self, included: List[Territory]):
        """Sets the included of this EndUserLicenseAgreementResponse.


        :param included: The included of this EndUserLicenseAgreementResponse.
        :type included: List[Territory]
        """

        self._included = included

    @property
    def links(self) -> DocumentLinks:
        """Gets the links of this EndUserLicenseAgreementResponse.


        :return: The links of this EndUserLicenseAgreementResponse.
        :rtype: DocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: DocumentLinks):
        """Sets the links of this EndUserLicenseAgreementResponse.


        :param links: The links of this EndUserLicenseAgreementResponse.
        :type links: DocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links
