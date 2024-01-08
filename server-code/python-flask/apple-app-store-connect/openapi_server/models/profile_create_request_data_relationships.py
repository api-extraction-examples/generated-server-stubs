from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.bundle_id_capability_create_request_data_relationships_bundle_id import BundleIdCapabilityCreateRequestDataRelationshipsBundleId
from openapi_server.models.profile_create_request_data_relationships_certificates import ProfileCreateRequestDataRelationshipsCertificates
from openapi_server.models.profile_create_request_data_relationships_devices import ProfileCreateRequestDataRelationshipsDevices
from openapi_server import util

from openapi_server.models.bundle_id_capability_create_request_data_relationships_bundle_id import BundleIdCapabilityCreateRequestDataRelationshipsBundleId  # noqa: E501
from openapi_server.models.profile_create_request_data_relationships_certificates import ProfileCreateRequestDataRelationshipsCertificates  # noqa: E501
from openapi_server.models.profile_create_request_data_relationships_devices import ProfileCreateRequestDataRelationshipsDevices  # noqa: E501

class ProfileCreateRequestDataRelationships(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, bundle_id=None, certificates=None, devices=None):  # noqa: E501
        """ProfileCreateRequestDataRelationships - a model defined in OpenAPI

        :param bundle_id: The bundle_id of this ProfileCreateRequestDataRelationships.  # noqa: E501
        :type bundle_id: BundleIdCapabilityCreateRequestDataRelationshipsBundleId
        :param certificates: The certificates of this ProfileCreateRequestDataRelationships.  # noqa: E501
        :type certificates: ProfileCreateRequestDataRelationshipsCertificates
        :param devices: The devices of this ProfileCreateRequestDataRelationships.  # noqa: E501
        :type devices: ProfileCreateRequestDataRelationshipsDevices
        """
        self.openapi_types = {
            'bundle_id': BundleIdCapabilityCreateRequestDataRelationshipsBundleId,
            'certificates': ProfileCreateRequestDataRelationshipsCertificates,
            'devices': ProfileCreateRequestDataRelationshipsDevices
        }

        self.attribute_map = {
            'bundle_id': 'bundleId',
            'certificates': 'certificates',
            'devices': 'devices'
        }

        self._bundle_id = bundle_id
        self._certificates = certificates
        self._devices = devices

    @classmethod
    def from_dict(cls, dikt) -> 'ProfileCreateRequestDataRelationships':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ProfileCreateRequest_data_relationships of this ProfileCreateRequestDataRelationships.  # noqa: E501
        :rtype: ProfileCreateRequestDataRelationships
        """
        return util.deserialize_model(dikt, cls)

    @property
    def bundle_id(self) -> BundleIdCapabilityCreateRequestDataRelationshipsBundleId:
        """Gets the bundle_id of this ProfileCreateRequestDataRelationships.


        :return: The bundle_id of this ProfileCreateRequestDataRelationships.
        :rtype: BundleIdCapabilityCreateRequestDataRelationshipsBundleId
        """
        return self._bundle_id

    @bundle_id.setter
    def bundle_id(self, bundle_id: BundleIdCapabilityCreateRequestDataRelationshipsBundleId):
        """Sets the bundle_id of this ProfileCreateRequestDataRelationships.


        :param bundle_id: The bundle_id of this ProfileCreateRequestDataRelationships.
        :type bundle_id: BundleIdCapabilityCreateRequestDataRelationshipsBundleId
        """
        if bundle_id is None:
            raise ValueError("Invalid value for `bundle_id`, must not be `None`")  # noqa: E501

        self._bundle_id = bundle_id

    @property
    def certificates(self) -> ProfileCreateRequestDataRelationshipsCertificates:
        """Gets the certificates of this ProfileCreateRequestDataRelationships.


        :return: The certificates of this ProfileCreateRequestDataRelationships.
        :rtype: ProfileCreateRequestDataRelationshipsCertificates
        """
        return self._certificates

    @certificates.setter
    def certificates(self, certificates: ProfileCreateRequestDataRelationshipsCertificates):
        """Sets the certificates of this ProfileCreateRequestDataRelationships.


        :param certificates: The certificates of this ProfileCreateRequestDataRelationships.
        :type certificates: ProfileCreateRequestDataRelationshipsCertificates
        """
        if certificates is None:
            raise ValueError("Invalid value for `certificates`, must not be `None`")  # noqa: E501

        self._certificates = certificates

    @property
    def devices(self) -> ProfileCreateRequestDataRelationshipsDevices:
        """Gets the devices of this ProfileCreateRequestDataRelationships.


        :return: The devices of this ProfileCreateRequestDataRelationships.
        :rtype: ProfileCreateRequestDataRelationshipsDevices
        """
        return self._devices

    @devices.setter
    def devices(self, devices: ProfileCreateRequestDataRelationshipsDevices):
        """Sets the devices of this ProfileCreateRequestDataRelationships.


        :param devices: The devices of this ProfileCreateRequestDataRelationships.
        :type devices: ProfileCreateRequestDataRelationshipsDevices
        """

        self._devices = devices