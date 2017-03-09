/* jquery.xrx_extend_simplemodal-1.1.1.js - extensions for overlay event handling

  Purpose: jquery.simplemodal.js answers 95% of our needs, but we also to allow
           the user to click on the overlay itself to close this window.
*/

jQuery.extend(jQuery.modal.impl, {
	bindEvents : function () {
		var modal = this;

		// bind the close event to any element with the closeClass class
		jQuery('.' + this.o.closeClass).click(function (e) {
			//e.preventDefault();
			//modal.close();
			//displayLink();
		});
		jQuery('#'+this.o.overlayId).click(function (e) {
			//e.preventDefault();
			//modal.close();
			//displayLink();
		});
		jQuery('.modalContainer').click(function (e) {
			if ( e.target.id == 'modalContainer' ) {
				//e.preventDefault();
				//modal.close();
				//displayLink();
			}
		});
	},
	unbindEvents : function () {
		// remove the close event
		jQuery('.' + this.o.closeClass).unbind('click');
		jQuery('#'+this.o.overlayId).unbind('click');
		jQuery('.modalContainer').unbind('click');
	}
});

