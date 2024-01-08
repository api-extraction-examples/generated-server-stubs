from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class IdfaDeclarationAttributes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes_action_with_previous_ad=None, attributes_app_installation_to_previous_ad=None, honors_limited_ad_tracking=None, serves_ads=None):  # noqa: E501
        """IdfaDeclarationAttributes - a model defined in OpenAPI

        :param attributes_action_with_previous_ad: The attributes_action_with_previous_ad of this IdfaDeclarationAttributes.  # noqa: E501
        :type attributes_action_with_previous_ad: bool
        :param attributes_app_installation_to_previous_ad: The attributes_app_installation_to_previous_ad of this IdfaDeclarationAttributes.  # noqa: E501
        :type attributes_app_installation_to_previous_ad: bool
        :param honors_limited_ad_tracking: The honors_limited_ad_tracking of this IdfaDeclarationAttributes.  # noqa: E501
        :type honors_limited_ad_tracking: bool
        :param serves_ads: The serves_ads of this IdfaDeclarationAttributes.  # noqa: E501
        :type serves_ads: bool
        """
        self.openapi_types = {
            'attributes_action_with_previous_ad': bool,
            'attributes_app_installation_to_previous_ad': bool,
            'honors_limited_ad_tracking': bool,
            'serves_ads': bool
        }

        self.attribute_map = {
            'attributes_action_with_previous_ad': 'attributesActionWithPreviousAd',
            'attributes_app_installation_to_previous_ad': 'attributesAppInstallationToPreviousAd',
            'honors_limited_ad_tracking': 'honorsLimitedAdTracking',
            'serves_ads': 'servesAds'
        }

        self._attributes_action_with_previous_ad = attributes_action_with_previous_ad
        self._attributes_app_installation_to_previous_ad = attributes_app_installation_to_previous_ad
        self._honors_limited_ad_tracking = honors_limited_ad_tracking
        self._serves_ads = serves_ads

    @classmethod
    def from_dict(cls, dikt) -> 'IdfaDeclarationAttributes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The IdfaDeclaration_attributes of this IdfaDeclarationAttributes.  # noqa: E501
        :rtype: IdfaDeclarationAttributes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes_action_with_previous_ad(self) -> bool:
        """Gets the attributes_action_with_previous_ad of this IdfaDeclarationAttributes.


        :return: The attributes_action_with_previous_ad of this IdfaDeclarationAttributes.
        :rtype: bool
        """
        return self._attributes_action_with_previous_ad

    @attributes_action_with_previous_ad.setter
    def attributes_action_with_previous_ad(self, attributes_action_with_previous_ad: bool):
        """Sets the attributes_action_with_previous_ad of this IdfaDeclarationAttributes.


        :param attributes_action_with_previous_ad: The attributes_action_with_previous_ad of this IdfaDeclarationAttributes.
        :type attributes_action_with_previous_ad: bool
        """

        self._attributes_action_with_previous_ad = attributes_action_with_previous_ad

    @property
    def attributes_app_installation_to_previous_ad(self) -> bool:
        """Gets the attributes_app_installation_to_previous_ad of this IdfaDeclarationAttributes.


        :return: The attributes_app_installation_to_previous_ad of this IdfaDeclarationAttributes.
        :rtype: bool
        """
        return self._attributes_app_installation_to_previous_ad

    @attributes_app_installation_to_previous_ad.setter
    def attributes_app_installation_to_previous_ad(self, attributes_app_installation_to_previous_ad: bool):
        """Sets the attributes_app_installation_to_previous_ad of this IdfaDeclarationAttributes.


        :param attributes_app_installation_to_previous_ad: The attributes_app_installation_to_previous_ad of this IdfaDeclarationAttributes.
        :type attributes_app_installation_to_previous_ad: bool
        """

        self._attributes_app_installation_to_previous_ad = attributes_app_installation_to_previous_ad

    @property
    def honors_limited_ad_tracking(self) -> bool:
        """Gets the honors_limited_ad_tracking of this IdfaDeclarationAttributes.


        :return: The honors_limited_ad_tracking of this IdfaDeclarationAttributes.
        :rtype: bool
        """
        return self._honors_limited_ad_tracking

    @honors_limited_ad_tracking.setter
    def honors_limited_ad_tracking(self, honors_limited_ad_tracking: bool):
        """Sets the honors_limited_ad_tracking of this IdfaDeclarationAttributes.


        :param honors_limited_ad_tracking: The honors_limited_ad_tracking of this IdfaDeclarationAttributes.
        :type honors_limited_ad_tracking: bool
        """

        self._honors_limited_ad_tracking = honors_limited_ad_tracking

    @property
    def serves_ads(self) -> bool:
        """Gets the serves_ads of this IdfaDeclarationAttributes.


        :return: The serves_ads of this IdfaDeclarationAttributes.
        :rtype: bool
        """
        return self._serves_ads

    @serves_ads.setter
    def serves_ads(self, serves_ads: bool):
        """Sets the serves_ads of this IdfaDeclarationAttributes.


        :param serves_ads: The serves_ads of this IdfaDeclarationAttributes.
        :type serves_ads: bool
        """

        self._serves_ads = serves_ads