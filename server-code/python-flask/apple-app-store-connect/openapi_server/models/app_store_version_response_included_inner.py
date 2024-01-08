from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.age_rating_declaration import AgeRatingDeclaration
from openapi_server.models.app_store_review_detail import AppStoreReviewDetail
from openapi_server.models.app_store_version_localization import AppStoreVersionLocalization
from openapi_server.models.app_store_version_phased_release import AppStoreVersionPhasedRelease
from openapi_server.models.app_store_version_submission import AppStoreVersionSubmission
from openapi_server.models.app_store_version_submission_relationships import AppStoreVersionSubmissionRelationships
from openapi_server.models.build import Build
from openapi_server.models.idfa_declaration import IdfaDeclaration
from openapi_server.models.idfa_declaration_attributes import IdfaDeclarationAttributes
from openapi_server.models.resource_links import ResourceLinks
from openapi_server.models.routing_app_coverage import RoutingAppCoverage
from openapi_server import util

from openapi_server.models.age_rating_declaration import AgeRatingDeclaration  # noqa: E501
from openapi_server.models.app_store_review_detail import AppStoreReviewDetail  # noqa: E501
from openapi_server.models.app_store_version_localization import AppStoreVersionLocalization  # noqa: E501
from openapi_server.models.app_store_version_phased_release import AppStoreVersionPhasedRelease  # noqa: E501
from openapi_server.models.app_store_version_submission import AppStoreVersionSubmission  # noqa: E501
from openapi_server.models.app_store_version_submission_relationships import AppStoreVersionSubmissionRelationships  # noqa: E501
from openapi_server.models.build import Build  # noqa: E501
from openapi_server.models.idfa_declaration import IdfaDeclaration  # noqa: E501
from openapi_server.models.idfa_declaration_attributes import IdfaDeclarationAttributes  # noqa: E501
from openapi_server.models.resource_links import ResourceLinks  # noqa: E501
from openapi_server.models.routing_app_coverage import RoutingAppCoverage  # noqa: E501

class AppStoreVersionResponseIncludedInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, links=None, type=None, relationships=None):  # noqa: E501
        """AppStoreVersionResponseIncludedInner - a model defined in OpenAPI

        :param attributes: The attributes of this AppStoreVersionResponseIncludedInner.  # noqa: E501
        :type attributes: IdfaDeclarationAttributes
        :param id: The id of this AppStoreVersionResponseIncludedInner.  # noqa: E501
        :type id: str
        :param links: The links of this AppStoreVersionResponseIncludedInner.  # noqa: E501
        :type links: ResourceLinks
        :param type: The type of this AppStoreVersionResponseIncludedInner.  # noqa: E501
        :type type: str
        :param relationships: The relationships of this AppStoreVersionResponseIncludedInner.  # noqa: E501
        :type relationships: AppStoreVersionSubmissionRelationships
        """
        self.openapi_types = {
            'attributes': IdfaDeclarationAttributes,
            'id': str,
            'links': ResourceLinks,
            'type': str,
            'relationships': AppStoreVersionSubmissionRelationships
        }

        self.attribute_map = {
            'attributes': 'attributes',
            'id': 'id',
            'links': 'links',
            'type': 'type',
            'relationships': 'relationships'
        }

        self._attributes = attributes
        self._id = id
        self._links = links
        self._type = type
        self._relationships = relationships

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreVersionResponseIncludedInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreVersionResponse_included_inner of this AppStoreVersionResponseIncludedInner.  # noqa: E501
        :rtype: AppStoreVersionResponseIncludedInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> IdfaDeclarationAttributes:
        """Gets the attributes of this AppStoreVersionResponseIncludedInner.


        :return: The attributes of this AppStoreVersionResponseIncludedInner.
        :rtype: IdfaDeclarationAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: IdfaDeclarationAttributes):
        """Sets the attributes of this AppStoreVersionResponseIncludedInner.


        :param attributes: The attributes of this AppStoreVersionResponseIncludedInner.
        :type attributes: IdfaDeclarationAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this AppStoreVersionResponseIncludedInner.


        :return: The id of this AppStoreVersionResponseIncludedInner.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this AppStoreVersionResponseIncludedInner.


        :param id: The id of this AppStoreVersionResponseIncludedInner.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def links(self) -> ResourceLinks:
        """Gets the links of this AppStoreVersionResponseIncludedInner.


        :return: The links of this AppStoreVersionResponseIncludedInner.
        :rtype: ResourceLinks
        """
        return self._links

    @links.setter
    def links(self, links: ResourceLinks):
        """Sets the links of this AppStoreVersionResponseIncludedInner.


        :param links: The links of this AppStoreVersionResponseIncludedInner.
        :type links: ResourceLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def type(self) -> str:
        """Gets the type of this AppStoreVersionResponseIncludedInner.


        :return: The type of this AppStoreVersionResponseIncludedInner.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this AppStoreVersionResponseIncludedInner.


        :param type: The type of this AppStoreVersionResponseIncludedInner.
        :type type: str
        """
        allowed_values = ["ageRatingDeclarations", "appStoreVersionLocalizations", "builds", "appStoreVersionPhasedReleases", "routingAppCoverages", "appStoreReviewDetails", "appStoreVersionSubmissions", "idfaDeclarations"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def relationships(self) -> AppStoreVersionSubmissionRelationships:
        """Gets the relationships of this AppStoreVersionResponseIncludedInner.


        :return: The relationships of this AppStoreVersionResponseIncludedInner.
        :rtype: AppStoreVersionSubmissionRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: AppStoreVersionSubmissionRelationships):
        """Sets the relationships of this AppStoreVersionResponseIncludedInner.


        :param relationships: The relationships of this AppStoreVersionResponseIncludedInner.
        :type relationships: AppStoreVersionSubmissionRelationships
        """

        self._relationships = relationships
