from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.beta_group import BetaGroup
from openapi_server.models.beta_group_response_included_inner import BetaGroupResponseIncludedInner
from openapi_server.models.document_links import DocumentLinks
from openapi_server import util

from openapi_server.models.beta_group import BetaGroup  # noqa: E501
from openapi_server.models.beta_group_response_included_inner import BetaGroupResponseIncludedInner  # noqa: E501
from openapi_server.models.document_links import DocumentLinks  # noqa: E501

class BetaGroupResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, included=None, links=None):  # noqa: E501
        """BetaGroupResponse - a model defined in OpenAPI

        :param data: The data of this BetaGroupResponse.  # noqa: E501
        :type data: BetaGroup
        :param included: The included of this BetaGroupResponse.  # noqa: E501
        :type included: List[BetaGroupResponseIncludedInner]
        :param links: The links of this BetaGroupResponse.  # noqa: E501
        :type links: DocumentLinks
        """
        self.openapi_types = {
            'data': BetaGroup,
            'included': List[BetaGroupResponseIncludedInner],
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
    def from_dict(cls, dikt) -> 'BetaGroupResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaGroupResponse of this BetaGroupResponse.  # noqa: E501
        :rtype: BetaGroupResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> BetaGroup:
        """Gets the data of this BetaGroupResponse.


        :return: The data of this BetaGroupResponse.
        :rtype: BetaGroup
        """
        return self._data

    @data.setter
    def data(self, data: BetaGroup):
        """Sets the data of this BetaGroupResponse.


        :param data: The data of this BetaGroupResponse.
        :type data: BetaGroup
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def included(self) -> List[BetaGroupResponseIncludedInner]:
        """Gets the included of this BetaGroupResponse.


        :return: The included of this BetaGroupResponse.
        :rtype: List[BetaGroupResponseIncludedInner]
        """
        return self._included

    @included.setter
    def included(self, included: List[BetaGroupResponseIncludedInner]):
        """Sets the included of this BetaGroupResponse.


        :param included: The included of this BetaGroupResponse.
        :type included: List[BetaGroupResponseIncludedInner]
        """

        self._included = included

    @property
    def links(self) -> DocumentLinks:
        """Gets the links of this BetaGroupResponse.


        :return: The links of this BetaGroupResponse.
        :rtype: DocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: DocumentLinks):
        """Sets the links of this BetaGroupResponse.


        :param links: The links of this BetaGroupResponse.
        :type links: DocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links
