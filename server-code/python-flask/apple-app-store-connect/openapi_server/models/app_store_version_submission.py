from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_store_version_submission_relationships import AppStoreVersionSubmissionRelationships
from openapi_server.models.resource_links import ResourceLinks
from openapi_server import util

from openapi_server.models.app_store_version_submission_relationships import AppStoreVersionSubmissionRelationships  # noqa: E501
from openapi_server.models.resource_links import ResourceLinks  # noqa: E501

class AppStoreVersionSubmission(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, links=None, relationships=None, type=None):  # noqa: E501
        """AppStoreVersionSubmission - a model defined in OpenAPI

        :param id: The id of this AppStoreVersionSubmission.  # noqa: E501
        :type id: str
        :param links: The links of this AppStoreVersionSubmission.  # noqa: E501
        :type links: ResourceLinks
        :param relationships: The relationships of this AppStoreVersionSubmission.  # noqa: E501
        :type relationships: AppStoreVersionSubmissionRelationships
        :param type: The type of this AppStoreVersionSubmission.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'id': str,
            'links': ResourceLinks,
            'relationships': AppStoreVersionSubmissionRelationships,
            'type': str
        }

        self.attribute_map = {
            'id': 'id',
            'links': 'links',
            'relationships': 'relationships',
            'type': 'type'
        }

        self._id = id
        self._links = links
        self._relationships = relationships
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreVersionSubmission':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreVersionSubmission of this AppStoreVersionSubmission.  # noqa: E501
        :rtype: AppStoreVersionSubmission
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this AppStoreVersionSubmission.


        :return: The id of this AppStoreVersionSubmission.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this AppStoreVersionSubmission.


        :param id: The id of this AppStoreVersionSubmission.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def links(self) -> ResourceLinks:
        """Gets the links of this AppStoreVersionSubmission.


        :return: The links of this AppStoreVersionSubmission.
        :rtype: ResourceLinks
        """
        return self._links

    @links.setter
    def links(self, links: ResourceLinks):
        """Sets the links of this AppStoreVersionSubmission.


        :param links: The links of this AppStoreVersionSubmission.
        :type links: ResourceLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def relationships(self) -> AppStoreVersionSubmissionRelationships:
        """Gets the relationships of this AppStoreVersionSubmission.


        :return: The relationships of this AppStoreVersionSubmission.
        :rtype: AppStoreVersionSubmissionRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: AppStoreVersionSubmissionRelationships):
        """Sets the relationships of this AppStoreVersionSubmission.


        :param relationships: The relationships of this AppStoreVersionSubmission.
        :type relationships: AppStoreVersionSubmissionRelationships
        """

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this AppStoreVersionSubmission.


        :return: The type of this AppStoreVersionSubmission.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this AppStoreVersionSubmission.


        :param type: The type of this AppStoreVersionSubmission.
        :type type: str
        """
        allowed_values = ["appStoreVersionSubmissions"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type