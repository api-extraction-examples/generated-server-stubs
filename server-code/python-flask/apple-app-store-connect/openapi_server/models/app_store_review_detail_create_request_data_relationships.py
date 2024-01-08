from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_store_review_detail_create_request_data_relationships_app_store_version import AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion
from openapi_server import util

from openapi_server.models.app_store_review_detail_create_request_data_relationships_app_store_version import AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion  # noqa: E501

class AppStoreReviewDetailCreateRequestDataRelationships(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, app_store_version=None):  # noqa: E501
        """AppStoreReviewDetailCreateRequestDataRelationships - a model defined in OpenAPI

        :param app_store_version: The app_store_version of this AppStoreReviewDetailCreateRequestDataRelationships.  # noqa: E501
        :type app_store_version: AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion
        """
        self.openapi_types = {
            'app_store_version': AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion
        }

        self.attribute_map = {
            'app_store_version': 'appStoreVersion'
        }

        self._app_store_version = app_store_version

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreReviewDetailCreateRequestDataRelationships':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreReviewDetailCreateRequest_data_relationships of this AppStoreReviewDetailCreateRequestDataRelationships.  # noqa: E501
        :rtype: AppStoreReviewDetailCreateRequestDataRelationships
        """
        return util.deserialize_model(dikt, cls)

    @property
    def app_store_version(self) -> AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion:
        """Gets the app_store_version of this AppStoreReviewDetailCreateRequestDataRelationships.


        :return: The app_store_version of this AppStoreReviewDetailCreateRequestDataRelationships.
        :rtype: AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion
        """
        return self._app_store_version

    @app_store_version.setter
    def app_store_version(self, app_store_version: AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion):
        """Sets the app_store_version of this AppStoreReviewDetailCreateRequestDataRelationships.


        :param app_store_version: The app_store_version of this AppStoreReviewDetailCreateRequestDataRelationships.
        :type app_store_version: AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion
        """
        if app_store_version is None:
            raise ValueError("Invalid value for `app_store_version`, must not be `None`")  # noqa: E501

        self._app_store_version = app_store_version