from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_store_version_relationships_build import AppStoreVersionRelationshipsBuild
from openapi_server import util

from openapi_server.models.app_store_version_relationships_build import AppStoreVersionRelationshipsBuild  # noqa: E501

class BetaAppReviewSubmissionRelationships(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, build=None):  # noqa: E501
        """BetaAppReviewSubmissionRelationships - a model defined in OpenAPI

        :param build: The build of this BetaAppReviewSubmissionRelationships.  # noqa: E501
        :type build: AppStoreVersionRelationshipsBuild
        """
        self.openapi_types = {
            'build': AppStoreVersionRelationshipsBuild
        }

        self.attribute_map = {
            'build': 'build'
        }

        self._build = build

    @classmethod
    def from_dict(cls, dikt) -> 'BetaAppReviewSubmissionRelationships':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaAppReviewSubmission_relationships of this BetaAppReviewSubmissionRelationships.  # noqa: E501
        :rtype: BetaAppReviewSubmissionRelationships
        """
        return util.deserialize_model(dikt, cls)

    @property
    def build(self) -> AppStoreVersionRelationshipsBuild:
        """Gets the build of this BetaAppReviewSubmissionRelationships.


        :return: The build of this BetaAppReviewSubmissionRelationships.
        :rtype: AppStoreVersionRelationshipsBuild
        """
        return self._build

    @build.setter
    def build(self, build: AppStoreVersionRelationshipsBuild):
        """Sets the build of this BetaAppReviewSubmissionRelationships.


        :param build: The build of this BetaAppReviewSubmissionRelationships.
        :type build: AppStoreVersionRelationshipsBuild
        """

        self._build = build
