from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_encryption_declaration_relationships_app import AppEncryptionDeclarationRelationshipsApp
from openapi_server.models.app_store_review_attachment_relationships_app_store_review_detail import AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail
from openapi_server.models.app_store_version_relationships_age_rating_declaration import AppStoreVersionRelationshipsAgeRatingDeclaration
from openapi_server.models.app_store_version_relationships_app_store_version_localizations import AppStoreVersionRelationshipsAppStoreVersionLocalizations
from openapi_server.models.app_store_version_relationships_app_store_version_phased_release import AppStoreVersionRelationshipsAppStoreVersionPhasedRelease
from openapi_server.models.app_store_version_relationships_app_store_version_submission import AppStoreVersionRelationshipsAppStoreVersionSubmission
from openapi_server.models.app_store_version_relationships_build import AppStoreVersionRelationshipsBuild
from openapi_server.models.app_store_version_relationships_idfa_declaration import AppStoreVersionRelationshipsIdfaDeclaration
from openapi_server.models.app_store_version_relationships_routing_app_coverage import AppStoreVersionRelationshipsRoutingAppCoverage
from openapi_server import util

from openapi_server.models.app_encryption_declaration_relationships_app import AppEncryptionDeclarationRelationshipsApp  # noqa: E501
from openapi_server.models.app_store_review_attachment_relationships_app_store_review_detail import AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail  # noqa: E501
from openapi_server.models.app_store_version_relationships_age_rating_declaration import AppStoreVersionRelationshipsAgeRatingDeclaration  # noqa: E501
from openapi_server.models.app_store_version_relationships_app_store_version_localizations import AppStoreVersionRelationshipsAppStoreVersionLocalizations  # noqa: E501
from openapi_server.models.app_store_version_relationships_app_store_version_phased_release import AppStoreVersionRelationshipsAppStoreVersionPhasedRelease  # noqa: E501
from openapi_server.models.app_store_version_relationships_app_store_version_submission import AppStoreVersionRelationshipsAppStoreVersionSubmission  # noqa: E501
from openapi_server.models.app_store_version_relationships_build import AppStoreVersionRelationshipsBuild  # noqa: E501
from openapi_server.models.app_store_version_relationships_idfa_declaration import AppStoreVersionRelationshipsIdfaDeclaration  # noqa: E501
from openapi_server.models.app_store_version_relationships_routing_app_coverage import AppStoreVersionRelationshipsRoutingAppCoverage  # noqa: E501

class AppStoreVersionRelationships(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, age_rating_declaration=None, app=None, app_store_review_detail=None, app_store_version_localizations=None, app_store_version_phased_release=None, app_store_version_submission=None, build=None, idfa_declaration=None, routing_app_coverage=None):  # noqa: E501
        """AppStoreVersionRelationships - a model defined in OpenAPI

        :param age_rating_declaration: The age_rating_declaration of this AppStoreVersionRelationships.  # noqa: E501
        :type age_rating_declaration: AppStoreVersionRelationshipsAgeRatingDeclaration
        :param app: The app of this AppStoreVersionRelationships.  # noqa: E501
        :type app: AppEncryptionDeclarationRelationshipsApp
        :param app_store_review_detail: The app_store_review_detail of this AppStoreVersionRelationships.  # noqa: E501
        :type app_store_review_detail: AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail
        :param app_store_version_localizations: The app_store_version_localizations of this AppStoreVersionRelationships.  # noqa: E501
        :type app_store_version_localizations: AppStoreVersionRelationshipsAppStoreVersionLocalizations
        :param app_store_version_phased_release: The app_store_version_phased_release of this AppStoreVersionRelationships.  # noqa: E501
        :type app_store_version_phased_release: AppStoreVersionRelationshipsAppStoreVersionPhasedRelease
        :param app_store_version_submission: The app_store_version_submission of this AppStoreVersionRelationships.  # noqa: E501
        :type app_store_version_submission: AppStoreVersionRelationshipsAppStoreVersionSubmission
        :param build: The build of this AppStoreVersionRelationships.  # noqa: E501
        :type build: AppStoreVersionRelationshipsBuild
        :param idfa_declaration: The idfa_declaration of this AppStoreVersionRelationships.  # noqa: E501
        :type idfa_declaration: AppStoreVersionRelationshipsIdfaDeclaration
        :param routing_app_coverage: The routing_app_coverage of this AppStoreVersionRelationships.  # noqa: E501
        :type routing_app_coverage: AppStoreVersionRelationshipsRoutingAppCoverage
        """
        self.openapi_types = {
            'age_rating_declaration': AppStoreVersionRelationshipsAgeRatingDeclaration,
            'app': AppEncryptionDeclarationRelationshipsApp,
            'app_store_review_detail': AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail,
            'app_store_version_localizations': AppStoreVersionRelationshipsAppStoreVersionLocalizations,
            'app_store_version_phased_release': AppStoreVersionRelationshipsAppStoreVersionPhasedRelease,
            'app_store_version_submission': AppStoreVersionRelationshipsAppStoreVersionSubmission,
            'build': AppStoreVersionRelationshipsBuild,
            'idfa_declaration': AppStoreVersionRelationshipsIdfaDeclaration,
            'routing_app_coverage': AppStoreVersionRelationshipsRoutingAppCoverage
        }

        self.attribute_map = {
            'age_rating_declaration': 'ageRatingDeclaration',
            'app': 'app',
            'app_store_review_detail': 'appStoreReviewDetail',
            'app_store_version_localizations': 'appStoreVersionLocalizations',
            'app_store_version_phased_release': 'appStoreVersionPhasedRelease',
            'app_store_version_submission': 'appStoreVersionSubmission',
            'build': 'build',
            'idfa_declaration': 'idfaDeclaration',
            'routing_app_coverage': 'routingAppCoverage'
        }

        self._age_rating_declaration = age_rating_declaration
        self._app = app
        self._app_store_review_detail = app_store_review_detail
        self._app_store_version_localizations = app_store_version_localizations
        self._app_store_version_phased_release = app_store_version_phased_release
        self._app_store_version_submission = app_store_version_submission
        self._build = build
        self._idfa_declaration = idfa_declaration
        self._routing_app_coverage = routing_app_coverage

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreVersionRelationships':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreVersion_relationships of this AppStoreVersionRelationships.  # noqa: E501
        :rtype: AppStoreVersionRelationships
        """
        return util.deserialize_model(dikt, cls)

    @property
    def age_rating_declaration(self) -> AppStoreVersionRelationshipsAgeRatingDeclaration:
        """Gets the age_rating_declaration of this AppStoreVersionRelationships.


        :return: The age_rating_declaration of this AppStoreVersionRelationships.
        :rtype: AppStoreVersionRelationshipsAgeRatingDeclaration
        """
        return self._age_rating_declaration

    @age_rating_declaration.setter
    def age_rating_declaration(self, age_rating_declaration: AppStoreVersionRelationshipsAgeRatingDeclaration):
        """Sets the age_rating_declaration of this AppStoreVersionRelationships.


        :param age_rating_declaration: The age_rating_declaration of this AppStoreVersionRelationships.
        :type age_rating_declaration: AppStoreVersionRelationshipsAgeRatingDeclaration
        """

        self._age_rating_declaration = age_rating_declaration

    @property
    def app(self) -> AppEncryptionDeclarationRelationshipsApp:
        """Gets the app of this AppStoreVersionRelationships.


        :return: The app of this AppStoreVersionRelationships.
        :rtype: AppEncryptionDeclarationRelationshipsApp
        """
        return self._app

    @app.setter
    def app(self, app: AppEncryptionDeclarationRelationshipsApp):
        """Sets the app of this AppStoreVersionRelationships.


        :param app: The app of this AppStoreVersionRelationships.
        :type app: AppEncryptionDeclarationRelationshipsApp
        """

        self._app = app

    @property
    def app_store_review_detail(self) -> AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail:
        """Gets the app_store_review_detail of this AppStoreVersionRelationships.


        :return: The app_store_review_detail of this AppStoreVersionRelationships.
        :rtype: AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail
        """
        return self._app_store_review_detail

    @app_store_review_detail.setter
    def app_store_review_detail(self, app_store_review_detail: AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail):
        """Sets the app_store_review_detail of this AppStoreVersionRelationships.


        :param app_store_review_detail: The app_store_review_detail of this AppStoreVersionRelationships.
        :type app_store_review_detail: AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail
        """

        self._app_store_review_detail = app_store_review_detail

    @property
    def app_store_version_localizations(self) -> AppStoreVersionRelationshipsAppStoreVersionLocalizations:
        """Gets the app_store_version_localizations of this AppStoreVersionRelationships.


        :return: The app_store_version_localizations of this AppStoreVersionRelationships.
        :rtype: AppStoreVersionRelationshipsAppStoreVersionLocalizations
        """
        return self._app_store_version_localizations

    @app_store_version_localizations.setter
    def app_store_version_localizations(self, app_store_version_localizations: AppStoreVersionRelationshipsAppStoreVersionLocalizations):
        """Sets the app_store_version_localizations of this AppStoreVersionRelationships.


        :param app_store_version_localizations: The app_store_version_localizations of this AppStoreVersionRelationships.
        :type app_store_version_localizations: AppStoreVersionRelationshipsAppStoreVersionLocalizations
        """

        self._app_store_version_localizations = app_store_version_localizations

    @property
    def app_store_version_phased_release(self) -> AppStoreVersionRelationshipsAppStoreVersionPhasedRelease:
        """Gets the app_store_version_phased_release of this AppStoreVersionRelationships.


        :return: The app_store_version_phased_release of this AppStoreVersionRelationships.
        :rtype: AppStoreVersionRelationshipsAppStoreVersionPhasedRelease
        """
        return self._app_store_version_phased_release

    @app_store_version_phased_release.setter
    def app_store_version_phased_release(self, app_store_version_phased_release: AppStoreVersionRelationshipsAppStoreVersionPhasedRelease):
        """Sets the app_store_version_phased_release of this AppStoreVersionRelationships.


        :param app_store_version_phased_release: The app_store_version_phased_release of this AppStoreVersionRelationships.
        :type app_store_version_phased_release: AppStoreVersionRelationshipsAppStoreVersionPhasedRelease
        """

        self._app_store_version_phased_release = app_store_version_phased_release

    @property
    def app_store_version_submission(self) -> AppStoreVersionRelationshipsAppStoreVersionSubmission:
        """Gets the app_store_version_submission of this AppStoreVersionRelationships.


        :return: The app_store_version_submission of this AppStoreVersionRelationships.
        :rtype: AppStoreVersionRelationshipsAppStoreVersionSubmission
        """
        return self._app_store_version_submission

    @app_store_version_submission.setter
    def app_store_version_submission(self, app_store_version_submission: AppStoreVersionRelationshipsAppStoreVersionSubmission):
        """Sets the app_store_version_submission of this AppStoreVersionRelationships.


        :param app_store_version_submission: The app_store_version_submission of this AppStoreVersionRelationships.
        :type app_store_version_submission: AppStoreVersionRelationshipsAppStoreVersionSubmission
        """

        self._app_store_version_submission = app_store_version_submission

    @property
    def build(self) -> AppStoreVersionRelationshipsBuild:
        """Gets the build of this AppStoreVersionRelationships.


        :return: The build of this AppStoreVersionRelationships.
        :rtype: AppStoreVersionRelationshipsBuild
        """
        return self._build

    @build.setter
    def build(self, build: AppStoreVersionRelationshipsBuild):
        """Sets the build of this AppStoreVersionRelationships.


        :param build: The build of this AppStoreVersionRelationships.
        :type build: AppStoreVersionRelationshipsBuild
        """

        self._build = build

    @property
    def idfa_declaration(self) -> AppStoreVersionRelationshipsIdfaDeclaration:
        """Gets the idfa_declaration of this AppStoreVersionRelationships.


        :return: The idfa_declaration of this AppStoreVersionRelationships.
        :rtype: AppStoreVersionRelationshipsIdfaDeclaration
        """
        return self._idfa_declaration

    @idfa_declaration.setter
    def idfa_declaration(self, idfa_declaration: AppStoreVersionRelationshipsIdfaDeclaration):
        """Sets the idfa_declaration of this AppStoreVersionRelationships.


        :param idfa_declaration: The idfa_declaration of this AppStoreVersionRelationships.
        :type idfa_declaration: AppStoreVersionRelationshipsIdfaDeclaration
        """

        self._idfa_declaration = idfa_declaration

    @property
    def routing_app_coverage(self) -> AppStoreVersionRelationshipsRoutingAppCoverage:
        """Gets the routing_app_coverage of this AppStoreVersionRelationships.


        :return: The routing_app_coverage of this AppStoreVersionRelationships.
        :rtype: AppStoreVersionRelationshipsRoutingAppCoverage
        """
        return self._routing_app_coverage

    @routing_app_coverage.setter
    def routing_app_coverage(self, routing_app_coverage: AppStoreVersionRelationshipsRoutingAppCoverage):
        """Sets the routing_app_coverage of this AppStoreVersionRelationships.


        :param routing_app_coverage: The routing_app_coverage of this AppStoreVersionRelationships.
        :type routing_app_coverage: AppStoreVersionRelationshipsRoutingAppCoverage
        """

        self._routing_app_coverage = routing_app_coverage
