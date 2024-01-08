from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_media_asset_state import AppMediaAssetState
from openapi_server.models.image_asset import ImageAsset
from openapi_server.models.upload_operation import UploadOperation
from openapi_server import util

from openapi_server.models.app_media_asset_state import AppMediaAssetState  # noqa: E501
from openapi_server.models.image_asset import ImageAsset  # noqa: E501
from openapi_server.models.upload_operation import UploadOperation  # noqa: E501

class AppPreviewAttributes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, asset_delivery_state=None, file_name=None, file_size=None, mime_type=None, preview_frame_time_code=None, preview_image=None, source_file_checksum=None, upload_operations=None, video_url=None):  # noqa: E501
        """AppPreviewAttributes - a model defined in OpenAPI

        :param asset_delivery_state: The asset_delivery_state of this AppPreviewAttributes.  # noqa: E501
        :type asset_delivery_state: AppMediaAssetState
        :param file_name: The file_name of this AppPreviewAttributes.  # noqa: E501
        :type file_name: str
        :param file_size: The file_size of this AppPreviewAttributes.  # noqa: E501
        :type file_size: int
        :param mime_type: The mime_type of this AppPreviewAttributes.  # noqa: E501
        :type mime_type: str
        :param preview_frame_time_code: The preview_frame_time_code of this AppPreviewAttributes.  # noqa: E501
        :type preview_frame_time_code: str
        :param preview_image: The preview_image of this AppPreviewAttributes.  # noqa: E501
        :type preview_image: ImageAsset
        :param source_file_checksum: The source_file_checksum of this AppPreviewAttributes.  # noqa: E501
        :type source_file_checksum: str
        :param upload_operations: The upload_operations of this AppPreviewAttributes.  # noqa: E501
        :type upload_operations: List[UploadOperation]
        :param video_url: The video_url of this AppPreviewAttributes.  # noqa: E501
        :type video_url: str
        """
        self.openapi_types = {
            'asset_delivery_state': AppMediaAssetState,
            'file_name': str,
            'file_size': int,
            'mime_type': str,
            'preview_frame_time_code': str,
            'preview_image': ImageAsset,
            'source_file_checksum': str,
            'upload_operations': List[UploadOperation],
            'video_url': str
        }

        self.attribute_map = {
            'asset_delivery_state': 'assetDeliveryState',
            'file_name': 'fileName',
            'file_size': 'fileSize',
            'mime_type': 'mimeType',
            'preview_frame_time_code': 'previewFrameTimeCode',
            'preview_image': 'previewImage',
            'source_file_checksum': 'sourceFileChecksum',
            'upload_operations': 'uploadOperations',
            'video_url': 'videoUrl'
        }

        self._asset_delivery_state = asset_delivery_state
        self._file_name = file_name
        self._file_size = file_size
        self._mime_type = mime_type
        self._preview_frame_time_code = preview_frame_time_code
        self._preview_image = preview_image
        self._source_file_checksum = source_file_checksum
        self._upload_operations = upload_operations
        self._video_url = video_url

    @classmethod
    def from_dict(cls, dikt) -> 'AppPreviewAttributes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppPreview_attributes of this AppPreviewAttributes.  # noqa: E501
        :rtype: AppPreviewAttributes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def asset_delivery_state(self) -> AppMediaAssetState:
        """Gets the asset_delivery_state of this AppPreviewAttributes.


        :return: The asset_delivery_state of this AppPreviewAttributes.
        :rtype: AppMediaAssetState
        """
        return self._asset_delivery_state

    @asset_delivery_state.setter
    def asset_delivery_state(self, asset_delivery_state: AppMediaAssetState):
        """Sets the asset_delivery_state of this AppPreviewAttributes.


        :param asset_delivery_state: The asset_delivery_state of this AppPreviewAttributes.
        :type asset_delivery_state: AppMediaAssetState
        """

        self._asset_delivery_state = asset_delivery_state

    @property
    def file_name(self) -> str:
        """Gets the file_name of this AppPreviewAttributes.


        :return: The file_name of this AppPreviewAttributes.
        :rtype: str
        """
        return self._file_name

    @file_name.setter
    def file_name(self, file_name: str):
        """Sets the file_name of this AppPreviewAttributes.


        :param file_name: The file_name of this AppPreviewAttributes.
        :type file_name: str
        """

        self._file_name = file_name

    @property
    def file_size(self) -> int:
        """Gets the file_size of this AppPreviewAttributes.


        :return: The file_size of this AppPreviewAttributes.
        :rtype: int
        """
        return self._file_size

    @file_size.setter
    def file_size(self, file_size: int):
        """Sets the file_size of this AppPreviewAttributes.


        :param file_size: The file_size of this AppPreviewAttributes.
        :type file_size: int
        """

        self._file_size = file_size

    @property
    def mime_type(self) -> str:
        """Gets the mime_type of this AppPreviewAttributes.


        :return: The mime_type of this AppPreviewAttributes.
        :rtype: str
        """
        return self._mime_type

    @mime_type.setter
    def mime_type(self, mime_type: str):
        """Sets the mime_type of this AppPreviewAttributes.


        :param mime_type: The mime_type of this AppPreviewAttributes.
        :type mime_type: str
        """

        self._mime_type = mime_type

    @property
    def preview_frame_time_code(self) -> str:
        """Gets the preview_frame_time_code of this AppPreviewAttributes.


        :return: The preview_frame_time_code of this AppPreviewAttributes.
        :rtype: str
        """
        return self._preview_frame_time_code

    @preview_frame_time_code.setter
    def preview_frame_time_code(self, preview_frame_time_code: str):
        """Sets the preview_frame_time_code of this AppPreviewAttributes.


        :param preview_frame_time_code: The preview_frame_time_code of this AppPreviewAttributes.
        :type preview_frame_time_code: str
        """

        self._preview_frame_time_code = preview_frame_time_code

    @property
    def preview_image(self) -> ImageAsset:
        """Gets the preview_image of this AppPreviewAttributes.


        :return: The preview_image of this AppPreviewAttributes.
        :rtype: ImageAsset
        """
        return self._preview_image

    @preview_image.setter
    def preview_image(self, preview_image: ImageAsset):
        """Sets the preview_image of this AppPreviewAttributes.


        :param preview_image: The preview_image of this AppPreviewAttributes.
        :type preview_image: ImageAsset
        """

        self._preview_image = preview_image

    @property
    def source_file_checksum(self) -> str:
        """Gets the source_file_checksum of this AppPreviewAttributes.


        :return: The source_file_checksum of this AppPreviewAttributes.
        :rtype: str
        """
        return self._source_file_checksum

    @source_file_checksum.setter
    def source_file_checksum(self, source_file_checksum: str):
        """Sets the source_file_checksum of this AppPreviewAttributes.


        :param source_file_checksum: The source_file_checksum of this AppPreviewAttributes.
        :type source_file_checksum: str
        """

        self._source_file_checksum = source_file_checksum

    @property
    def upload_operations(self) -> List[UploadOperation]:
        """Gets the upload_operations of this AppPreviewAttributes.


        :return: The upload_operations of this AppPreviewAttributes.
        :rtype: List[UploadOperation]
        """
        return self._upload_operations

    @upload_operations.setter
    def upload_operations(self, upload_operations: List[UploadOperation]):
        """Sets the upload_operations of this AppPreviewAttributes.


        :param upload_operations: The upload_operations of this AppPreviewAttributes.
        :type upload_operations: List[UploadOperation]
        """

        self._upload_operations = upload_operations

    @property
    def video_url(self) -> str:
        """Gets the video_url of this AppPreviewAttributes.


        :return: The video_url of this AppPreviewAttributes.
        :rtype: str
        """
        return self._video_url

    @video_url.setter
    def video_url(self, video_url: str):
        """Sets the video_url of this AppPreviewAttributes.


        :param video_url: The video_url of this AppPreviewAttributes.
        :type video_url: str
        """

        self._video_url = video_url