from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_info import AppInfo
from openapi_server.models.app_pre_order import AppPreOrder
from openapi_server.models.app_price import AppPrice
from openapi_server.models.app_store_version import AppStoreVersion
from openapi_server.models.beta_app_localization import BetaAppLocalization
from openapi_server.models.beta_app_review_detail import BetaAppReviewDetail
from openapi_server.models.beta_group import BetaGroup
from openapi_server.models.beta_license_agreement import BetaLicenseAgreement
from openapi_server.models.build import Build
from openapi_server.models.end_user_license_agreement import EndUserLicenseAgreement
from openapi_server.models.game_center_enabled_version import GameCenterEnabledVersion
from openapi_server.models.game_center_enabled_version_relationships import GameCenterEnabledVersionRelationships
from openapi_server.models.in_app_purchase import InAppPurchase
from openapi_server.models.perf_power_metric import PerfPowerMetric
from openapi_server.models.perf_power_metric_attributes import PerfPowerMetricAttributes
from openapi_server.models.prerelease_version import PrereleaseVersion
from openapi_server.models.resource_links import ResourceLinks
from openapi_server.models.territory import Territory
from openapi_server import util

from openapi_server.models.app_info import AppInfo  # noqa: E501
from openapi_server.models.app_pre_order import AppPreOrder  # noqa: E501
from openapi_server.models.app_price import AppPrice  # noqa: E501
from openapi_server.models.app_store_version import AppStoreVersion  # noqa: E501
from openapi_server.models.beta_app_localization import BetaAppLocalization  # noqa: E501
from openapi_server.models.beta_app_review_detail import BetaAppReviewDetail  # noqa: E501
from openapi_server.models.beta_group import BetaGroup  # noqa: E501
from openapi_server.models.beta_license_agreement import BetaLicenseAgreement  # noqa: E501
from openapi_server.models.build import Build  # noqa: E501
from openapi_server.models.end_user_license_agreement import EndUserLicenseAgreement  # noqa: E501
from openapi_server.models.game_center_enabled_version import GameCenterEnabledVersion  # noqa: E501
from openapi_server.models.game_center_enabled_version_relationships import GameCenterEnabledVersionRelationships  # noqa: E501
from openapi_server.models.in_app_purchase import InAppPurchase  # noqa: E501
from openapi_server.models.perf_power_metric import PerfPowerMetric  # noqa: E501
from openapi_server.models.perf_power_metric_attributes import PerfPowerMetricAttributes  # noqa: E501
from openapi_server.models.prerelease_version import PrereleaseVersion  # noqa: E501
from openapi_server.models.resource_links import ResourceLinks  # noqa: E501
from openapi_server.models.territory import Territory  # noqa: E501

class AppResponseIncludedInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, links=None, relationships=None, type=None):  # noqa: E501
        """AppResponseIncludedInner - a model defined in OpenAPI

        :param attributes: The attributes of this AppResponseIncludedInner.  # noqa: E501
        :type attributes: PerfPowerMetricAttributes
        :param id: The id of this AppResponseIncludedInner.  # noqa: E501
        :type id: str
        :param links: The links of this AppResponseIncludedInner.  # noqa: E501
        :type links: ResourceLinks
        :param relationships: The relationships of this AppResponseIncludedInner.  # noqa: E501
        :type relationships: GameCenterEnabledVersionRelationships
        :param type: The type of this AppResponseIncludedInner.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': PerfPowerMetricAttributes,
            'id': str,
            'links': ResourceLinks,
            'relationships': GameCenterEnabledVersionRelationships,
            'type': str
        }

        self.attribute_map = {
            'attributes': 'attributes',
            'id': 'id',
            'links': 'links',
            'relationships': 'relationships',
            'type': 'type'
        }

        self._attributes = attributes
        self._id = id
        self._links = links
        self._relationships = relationships
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'AppResponseIncludedInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppResponse_included_inner of this AppResponseIncludedInner.  # noqa: E501
        :rtype: AppResponseIncludedInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> PerfPowerMetricAttributes:
        """Gets the attributes of this AppResponseIncludedInner.


        :return: The attributes of this AppResponseIncludedInner.
        :rtype: PerfPowerMetricAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: PerfPowerMetricAttributes):
        """Sets the attributes of this AppResponseIncludedInner.


        :param attributes: The attributes of this AppResponseIncludedInner.
        :type attributes: PerfPowerMetricAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this AppResponseIncludedInner.


        :return: The id of this AppResponseIncludedInner.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this AppResponseIncludedInner.


        :param id: The id of this AppResponseIncludedInner.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def links(self) -> ResourceLinks:
        """Gets the links of this AppResponseIncludedInner.


        :return: The links of this AppResponseIncludedInner.
        :rtype: ResourceLinks
        """
        return self._links

    @links.setter
    def links(self, links: ResourceLinks):
        """Sets the links of this AppResponseIncludedInner.


        :param links: The links of this AppResponseIncludedInner.
        :type links: ResourceLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def relationships(self) -> GameCenterEnabledVersionRelationships:
        """Gets the relationships of this AppResponseIncludedInner.


        :return: The relationships of this AppResponseIncludedInner.
        :rtype: GameCenterEnabledVersionRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: GameCenterEnabledVersionRelationships):
        """Sets the relationships of this AppResponseIncludedInner.


        :param relationships: The relationships of this AppResponseIncludedInner.
        :type relationships: GameCenterEnabledVersionRelationships
        """

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this AppResponseIncludedInner.


        :return: The type of this AppResponseIncludedInner.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this AppResponseIncludedInner.


        :param type: The type of this AppResponseIncludedInner.
        :type type: str
        """
        allowed_values = ["betaGroups", "appStoreVersions", "preReleaseVersions", "betaAppLocalizations", "builds", "betaLicenseAgreements", "betaAppReviewDetails", "appInfos", "endUserLicenseAgreements", "appPreOrders", "appPrices", "territories", "inAppPurchases", "gameCenterEnabledVersions", "perfPowerMetrics"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
